/**
* Date: 12-11
* Description: Print class creates instances of Dog, Cat, and Others objects and provides methods for the main program to display detailed information about them.
*/

public class Print {
	
	// initiate dogs
	Dog dog1 = new Dog("Mylah", "9 months old", "Male", "Border Collie");
	Dog dog2 = new Dog("Brisket", "1 year 3 months old", "Female", "German Shepherd");
	Dog dog3 = new Dog("Jerky", "2 years 2 months old", "Male", "Staffordshire Bull Terrier mix");
	Dog dog4 = new Dog("Susie", "3 years old", "Female", " Miniature Poodle");
	Dog dog5 = new Dog("Chip", "8 months old", "Female", "Chihuahua");
	
	// generate a list of dogs
	private Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

	public Dog[] getDogs() {
		return dogs;
	}
	
	// get a dog element from the dogs array
	public Dog getDog(int choice) {
		return dogs[choice];
	}

	// print dogs
	public void printDogs() {
		for (int i = 0; i < dogs.length; i++) {
			System.out.println((i + 1) + ". " + dogs[i]);
		}
	}
	
	// print detailed info about a specific dog
	public void infoDog(int choice) {
		Dog selectedDog = dogs[choice - 1];
		System.out.println("MEET " + selectedDog.getName() + "\n");
		System.out.println("Status: " + (selectedDog.isAdopted() == false ? "Adoptable" : "Adopted") + "\n"
						+ "Name: " + selectedDog.getName() + "\n"
						+ "Age: " + selectedDog.getAge() + "\n"
						+ "Gender: " + selectedDog.getGender() + "\n"
						+ "Breed: " + selectedDog.getBreed() + "\n"
						+ "Characteristics: Friendly and Playful\n"
						+ "I have been at the shelter since Dec 0" + choice + ", 2024.");
	}
	
	
	// initiate cats
	Cat cat1 = new Cat("Pam", "12 weeks old", "Female", "Domestic Shorthair");
	Cat cat2 = new Cat("Giovanni", "2 years 1 month old", "Male", "Balinese");
	Cat cat3 = new Cat("Tipper", "8 weeks old", "Female", "Calico");
	Cat cat4 = new Cat("Luke", "1 year 5 months old", "Male", "Russian Blue");
	
	// generate a list of cats
	private Cat[] cats = {cat1, cat2, cat3, cat4};

	public Cat[] getCats() {
		return cats;
	}
	
	// get a cat element from the cats array
	public Cat getCat(int choice) {
		return cats[choice];
	}
	
	// print cats
	public void printCats() {
		for (int i = 0; i < cats.length; i++) {
			System.out.println((i + 1) + ". " + cats[i]);
		}
	}
	
	// print detailed info about a specific cat
	public void infoCat(int choice) {
		Cat selectedCat = cats[choice - 1];
		System.out.println("MEET " + selectedCat.getName() + "\n");
		System.out.println("Status: " + (selectedCat.isAdopted() == false ? "Adoptable" : "Adopted") + "\n"
						+ "Name: " + selectedCat.getName() + "\n"
						+ "Age: " + selectedCat.getAge() + "\n"
						+ "Gender: " + selectedCat.getGender() + "\n"
						+ "Breed: " + selectedCat.getBreed() + "\n"
						+ "Characteristics: Affectionate, Funny, and Gentle\n"
						+ "I have been at the shelter since Dec 0" + choice + ", 2024.");
	}
	
	// initiate other animals
	Others bird = new Others("Andy", "4 years old", "Male", "Cockatiel");
	Others guineaPig = new Others("Jet", "7 months old", "Male", "Guinea Pig");
	Others rabbit = new Others("Boxie", "2 years old", "Female", "Rabbit");
	
	// generate a list of other animals
	public Others[] others = {bird, guineaPig, rabbit};
	
	public Others[] getOthers() {
		return others;
	}
	
	// get an animal element from the Others array
		public Others getOther(int choice) {
			return others[choice];
		}
		
	// print other animals
	public void printOthers() {
		int index = 1;
	    for (Others element : others) {
	        System.out.println(index + ". " + element);
	        index++;
	    }
	}
	
	// print detailed info about a specific animal
	public void infoOther(int choice) {
		Others selectedOther = others[choice - 1];
		System.out.println("MEET " + selectedOther.getName() + "\n");
		System.out.println("Status: " + (selectedOther.isAdopted() == false ? "Adoptable" : "Adopted") + "\n"
						+ "Name: " + selectedOther.getName() + "\n"
						+ "Age: " + selectedOther.getAge() + "\n"
						+ "Gender: " + selectedOther.getGender() + "\n"
						+ "Breed: " + selectedOther.getBreed() + "\n"
						+ "Characteristics: Curious, Funny, and Playful\n"
						+ "I have been at the shelter since Dec 0" + choice + ", 2024.");
	
	}
}
