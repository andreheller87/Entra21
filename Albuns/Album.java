 

public class Album {

	private String name;
	private String artist;
	private double price;
	private int numberOfCopies;
	
	public void sellCopies() {
		if(numberOfCopies > 0) {
			numberOfCopies--;
			System.out.println("Um album foi vendido!");
		}else {
			System.out.println("Não há albuns disponiveis!");
		}
	}
	public void orderCopies(int num) {
		numberOfCopies+= num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
}
