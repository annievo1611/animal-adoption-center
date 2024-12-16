/**
* Name: An Vo
* Date: 12-11
* Description: subclass Cats extends Animals and implements Adoptable, 
* 			   adding adoption status and specific implementations for sounds, actions, and adoption fees.
*/

public class Cat extends Animals implements Adoptable {
	
	private boolean adopted;

	public Cat() {
		super();
	}
	
	public Cat(String name, String age, String gender, String breed) {
		super(name, age, gender, breed);
		this.adopted = false;
	}

	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
	
	@Override
	public void jumpAround() {
		System.out.println(this.getName() + " is jumping around.");
	}

	@Override
	public double adoptionFee() {
		return 100.00;
	}

	@Override
	public boolean isAdopted() {
		return adopted;
	}
	
	public String toString() {
		return super.toString();
	}
}
