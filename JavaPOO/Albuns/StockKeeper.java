package Albuns;

public class StockKeeper {
    private String name;
    
    public StockKeeper(String name) {
       
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public void manageAlbum(Album album,String name, String artist, double price,int numberOfCopies) {
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopies(numberOfCopies);

        System.out.println("Album gerenciado por: " + getName());
        System.out.println("Detalhas do album:::::::::");
        System.out.println("Nome do album: " + album.getName());
        System.out.println("Artista do album: " + album.getArtist());
        System.out.println("preço do album: " + album.getPrice());
        System.out.println("Número de cópias do album: " + album.getNumberOfCopies());
    }
}
