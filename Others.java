/**
* Date: 12-11
* Description: subclass Others extends Animals and implements Adoptable, 
* 			   adding adoption status and specific implementations for sounds, actions, and adoption fees.
*/

public class Others extends Animals implements Adoptable {

	private boolean adopted;
	
	public Others() {
		super();
	}
	
	public Others(String name, String age, String gender, String breed) {
		super(name, age, gender, breed);
		this.adopted = false;
	}

	@Override
	public void makeSound() {
		if (this.getBreed() == "Cockatiel")
			System.out.println("Chirping");
		else if (this.getBreed() == "Guinea Pig")
			System.out.println("Chutting");
		else if (this.getBreed() == "Rabbit")
			System.out.println("Purring");
	}
	
	@Override
	public void jumpAround() {
		System.out.println(this.getName() + " is jumping around.");
	}

	@Override
	public double adoptionFee() {
		return 150.00;
	}

	@Override
	public boolean isAdopted() {
		return adopted;
	}
	
	public String toString() {
		return super.toString();
	}
}
