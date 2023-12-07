 

public class StockKeeper {

	public String name;

	public StockKeeper(String name) {
		super();
		this.name = name;
	}
	
	
	public void manageAlbum(Album album,String name, String artist, double price,int numberOfCopies) {
		album.setName(name);
		album.setArtist(artist);
		album.setPrice(price);
		album.setNumberOfCopies(numberOfCopies);
		
		System.out.println("Album gerenciado por: " + this.name);
		System.out.println("Detalhas do album:::::::::");
		System.out.println("Nome do album: " + album.getName());
		System.out.println("Artista do album: " + album.getArtist());
		System.out.println("preço do album: " + album.getPrice());
		System.out.println("Número de cópias do album: " + album.getNumberOfCopies());
	}
}
