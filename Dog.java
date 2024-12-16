/**
* Name: An Vo
* Date: 12-11
* Description: subclass Dogs extends Animals and implements Adoptable, 
* 			   adding adoption status and specific implementations for sounds, actions, and adoption fees.
*/

public class Dog extends Animals implements Adoptable {
	
	private boolean adopted;
	
	public Dog() {
		super();
	}

	public Dog(String name, String age, String gender, String breed) {
		super(name, age, gender, breed);
		this.adopted = false;
	}

	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}

	@Override
	public void jumpAround() {
		System.out.println(this.getName() + " is jumping around.");
	}

	@Override
	public double adoptionFee() {
		return 200.00;
	}

	@Override
	public boolean isAdopted() {
		return adopted;
	}
	
	public String toString() {
		return super.toString();
	}
}
