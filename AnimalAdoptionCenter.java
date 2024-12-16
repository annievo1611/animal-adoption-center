/**
* Date: 12-11
* Description: Main program that allows users to adopt a pet. 
* 			   Users can see a list of available animals, see what they can do, and adopt them by paying a fee.
*/

import java.util.Scanner;
import java.util.Random;

public class AnimalAdoptionCenter {

	public static void main(String[] args) {

		// make BOLD outputs
		final String BOLD = "\033[1m";
        final String RESET = "\033[0m";
        
		Scanner input = new Scanner(System.in);
		Print print = new Print();
		Random random = new Random();

		System.out.println(BOLD + "WELCOME TO ANIMAL ADOPTION CENTER" + RESET);
		
		boolean continueProgram = true;
		while (continueProgram) {
			System.out.println(BOLD + "\nChoose the type of animals you want to adopt:\n"
								+ "1. Dogs\n"
								+ "2. Cats\n"
								+ "3. Others\n" + RESET);
			System.out.print("Enter your choice (1-3): ");
			int animalType = input.nextInt();
			System.out.println();
			
			if (animalType >= 1 && animalType <= 3) {
				String[] options = {"Dogs", "Cats", "Other Animals"};
                System.out.println(BOLD + "Available " + options[animalType - 1] + ":" + RESET);
			
				// get and print the appropriate animal list
	            switch (animalType) {
	                case 1: print.printDogs(); break;
	                case 2: print.printCats(); break;
	                case 3: print.printOthers(); break;
	                default: 
	                	System.out.println("INVALID choice. Please try again.");
	                	continueProgram = false;
	                	break;
	            }
	            
	            // prompt for choice
	            int choice = -1;
	            int listLength;
	            if (animalType == 1) {
	                listLength = print.getDogs().length;
	            } else if (animalType == 2) {
	                listLength = print.getCats().length;
	            } else {
	                listLength = print.getOthers().length;
	            }
	            
	            while (choice < 0 || choice > listLength) {
	                System.out.print(BOLD + "\nWhich one would you like more information about: " + RESET);
	                choice = input.nextInt();
	                if (choice < 0 || choice > listLength) {
	                    System.out.println("INVALID choice! Please try again.\n");
	                }
	            }
	            // print information of the chosen animal
	            if (choice > 0) {
	            	switch (animalType) {
		            	 case 1: 
		            		 print.infoDog(choice);
		            		 break;
		            	 case 2: 
		            		 print.infoCat(choice);
		            		 break;
		            	 case 3: 
		            		 print.infoOther(choice);
		            		 break;
	            	 }
	            
	            	// Perform actions
		            int action = 4;
		            do {
		                System.out.println(BOLD + "\nWhat " + (action != 4 ? "else " : "") + "do you want to do?" + RESET);
		                System.out.println("1. Make sound\n" +
		                        "2. Jump around\n" +
		                        "3. Do a trick\n" +
		                        "4. Continue adopting\n");
		                System.out.print("Enter your choice (1-4): ");
		                action = input.nextInt();
		                System.out.println();
		                
		                switch(action) {
			                case 1: {
			                	switch(animalType) {
			                	case 1: print.getDog(choice - 1).makeSound(); break;
			                    case 2: print.getCat(choice - 1).makeSound(); break;
			                    case 3: print.getOther(choice - 1).makeSound(); break;
			                	}
			                	break;
			                }
			                case 2: {
			                	switch(animalType) {
			                	case 1: print.getDog(choice - 1).jumpAround(); break;
			                    case 2: print.getCat(choice - 1).jumpAround(); break;
			                    case 3: print.getOther(choice - 1).jumpAround(); break;
			                	}
			                	break;
			                }
			                case 3: {
			                	String[] tricks;
			                	switch(animalType) {
			                	case 1: 
			                		tricks = print.getDog(choice - 1).doTrick();
									System.out.println(print.getDog(choice - 1).getName() + " is " + tricks[random.nextInt(tricks.length)] + ".");
									break;
			                    case 2: 
			                    	tricks = print.getCat(choice - 1).doTrick();
									System.out.println(print.getCat(choice - 1).getName() + " is " + tricks[random.nextInt(tricks.length)] + ".");
									break;
			                    case 3: 
			                    	tricks = print.getOther(choice - 1).doTrick();
									System.out.println(print.getOther(choice - 1).getName() + " is " + tricks[random.nextInt(tricks.length)] + ".");
									break;
			                	}
			                	break;
			                }
		                }
		            } while (action != 4);  
		            
		            // Adoption process
		            System.out.print(BOLD + "\nWould you like to adopt this animal? (1. Yes or 2. No): " + RESET);
		            int adopt = input.nextInt();
		            if (adopt == 1) {
		                double fee = 0;
		                switch (animalType) {
		                    case 1: fee = print.getDog(choice - 1).adoptionFee(); break;
		                    case 2: fee = print.getCat(choice - 1).adoptionFee(); break;
		                    case 3: fee = print.getOther(choice - 1).adoptionFee(); break;
		                }
		                
		                System.out.printf("\nYour adoption fee is: $%.2f.\n", fee);
		                System.out.println("Thank you for adopting! Goodbye.");
		                continueProgram = false;
		            } 
		            else {
		                System.out.print("\nWould you like to continue adopting? (1. Yes or 2. No): ");
		                if (input.nextInt() == 2) {
		                    System.out.println("\nThank you for visiting the Animal Adoption Center! See you again.");
		                    continueProgram = false;
		                }
		            }
	            }
	            else
	            	System.out.println("INVALID choice. Please try again.");
			}
			else
				System.out.println("INVALID choice. Please try again.");
		}
		input.close();
	} 
}


