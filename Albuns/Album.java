 

public class Album {

	public String name;
	public String artist;
	public double price;
	public int numberOfCopies;
	public void sellCopies() {
		if(numberOfCopies > 0) {
			
			System.out.println("Um album foi vendido!");
			numberOfCopies--;
		}else {
			System.out.println("Não há albuns disponiveis!");
		}
	}
	public void orderCopies(int num) {
		numberOfCopies += num;
	}
}
