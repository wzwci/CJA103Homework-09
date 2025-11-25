package hw7;

public class dog implements Animal {
	
	private String name;

	public dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
	
}