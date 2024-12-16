/**
* Date: 12-11
* Description: abstract class Animals serves as a prototype for animal objects, defining common attributes, and abstract methods that 
	           will be implemented by subclasses: Dogs.jav, Cats.jav, and Others.java.
*/

public abstract class Animals {

	private String name;
	private String age;
	private String gender;
	private String breed;

	public Animals() {
		
	}
	
	public Animals (String name, String age, String gender, String breed) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getBreed() {
		return breed;
	}
	
	public abstract void makeSound();
	public abstract void jumpAround();
	
	public String[] doTrick() {
		String[] tricks = {"fetching a ball", "rolling over", "sitting", "shaking hands", "playing dead", "spinning"};
		return tricks;
	}
	
	public abstract double adoptionFee();
	
	public String toString() {
		return name + ", " + age + ", " + gender + ", " + breed;
	}
}
