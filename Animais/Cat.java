 

public class Cat {

	private String name;
	private int age;
	private String color;
	private String breed;
	
	
	
	public Cat() {
		super();
	}

	public Cat(String name, int age, String color, String breed) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void sleep() {
		System.out.println("Dormindo");
	}
	
	public void play() {
		System.out.println("Brincando");
	}
	public void feed() {
		System.out.println("Comendo");
	}
}
