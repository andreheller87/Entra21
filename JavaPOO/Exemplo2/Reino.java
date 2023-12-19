package Exemplo2;

public class Reino {
	
	public   void fazerAnimalComer(Animal animal) {
		animal.comer();
	}
	public static void main(String[] args) {
	    
		Reino r = new Reino();
		r.fazerAnimalComer(new Animal());
		r.fazerAnimalComer(new Foca());
		r.fazerAnimalComer(new Urso());
		

	}
	

}
