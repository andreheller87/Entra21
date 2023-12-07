 

public class StockKeeper {

	public String name;

	public StockKeeper(String name) {
		super();
		this.name = name;
	}
    	
	
	public void manage(Album album,String name, String artist, double price,int numberOfCopies) {
		album.name = name;
		album.artist = artist;
		album.price = price;
		album.numberOfCopies = numberOfCopies;
		
		System.out.println("Album gerenciado por: " + this.name);
		System.out.println("Detalhas do album:::::::::");
		System.out.println("Nome do album: " + album.name);
		System.out.println("Artista do album: " + album.artist);
		System.out.println("preço do album: " + album.price);
		System.out.println("Número de cópias do album: " + album.numberOfCopies);
	}
}