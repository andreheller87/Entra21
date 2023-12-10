package Animais;

public class Main {

	public static void main(String[] args) {
		Cat thor = new Cat();
		Cat rambo = new Cat();
		

		thor.setName("thor");
		thor.setColor("Cinza");
		thor.setAge(3);
		thor.setBreed("Azul russo");
		
		rambo.setName("Rambo");
		rambo.setColor("Marron");
		rambo.setAge(4);
		rambo.setBreed("Maine Coon");
		
		thor.sleep();
		
		rambo.play();
		
	}

}
