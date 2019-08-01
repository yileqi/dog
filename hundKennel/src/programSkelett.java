//Yileqi Alfredsson,yial6761//

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class programSkelett {
	private void runCommando(){
		menuList();
		runloop();
		
	}
	private ArrayList<Dog> dogData = new ArrayList<Dog>();
	
	private void menuList() {
		System.out.println("Fast Commando:");
		System.out.println("Write register new dog to register new dog.");
		System.out.println("Write age to increase age.");
		System.out.println("Write list to list dogs.");
		System.out.println("Write remove to remove dog.");
		System.out.println("Write exit to exit.");
		
	}
	
		
	
	// alternativ
	private void runloop() {
		Scanner input = new Scanner(System.in);
		boolean alternativ = true;
		
		while (alternativ) {
			String choice = input.nextLine();
		
			switch (choice) {
	
				case "register":
				
					//choice = "register new dog";
					System.out.println(choice);
					String name;
					String breed;
					int age;
					double weight;
					System.out.println("Dog's name:");
					name = input.nextLine();
					
					System.out.println("Dog's breed");
					breed = input.nextLine();
					
					System.out.println("Dog's age");
					age = input.nextInt();
					
					System.out.println("Dog's weight");
					weight = input.nextDouble();
					
					Dog dog= new Dog(name,breed,age,weight);
					dogData.add(dog);
					System.out.println("The dog is in the register.");
					//choice = input.nextLine();
					break;
					
				case "age":
				
					choice = "increase age";
					System.out.println (choice);
					System.out.println("Dog's name:");
					String dogNeedIncreaseAge = input.nextLine();
					System.out.println("How many years to increase?");
					int increasedAge = input.nextInt();
					boolean dogExist = false;
					
					
					for (int i = 0; i < dogData.size();i++) {
						if(dogData.get(i).getName().equalsIgnoreCase(dogNeedIncreaseAge)) {
							dogData.get(i).increaseAge(increasedAge);
							dogExist = true;
						}
					}
					
					if (dogExist == false) {
						System.out.println("Error: dog with that name was not in the register.");
						
					}
					
					input.nextLine();
					break;
					
				case"list dogs":
				
					choice = "list dogs";
					System.out.println(choice);
					System.out.println("Enter the minimum tail length:");
					int minimumTailLength = input.nextInt();
					
					if(minimumTailLength == 0) {
						for (int i = 0; i < dogData.size();i++) {
							System.out.println(dogData.get(i).toString());
						}
						
					}
					else {
						for (int i = 0; i < dogData.size();i++) {
							if (dogData.get(i).getTailLength()>= minimumTailLength) {
								System.out.println(dogData.get(i).toString());
							}
						}
					}
					
					input.nextLine();
					break;
					
				case"remove":
				
					choice =" remove dog";
					System.out.println (choice);
					System.out.println("Dog's name:");
					String dogNeedToBeRemoved = input.nextLine();
					boolean dogNeedToBeRemovedExist = false;
					
					
					for (int i = 0; i < dogData.size();i++) {
						if(dogData.get(i).getName().equalsIgnoreCase(dogNeedToBeRemoved)) {
							dogNeedToBeRemovedExist = true;
							dogData.remove(i);
							System.out.println("The dog with the specified name has been removed.");
						}
					}
					
					if (dogNeedToBeRemovedExist == false) {
						System.out.println("Error: dog with that name was not in the register.");
						
					}
					input.nextLine();
					break;
					
				
				case "exit":
					choice = "exit";
					System.out.println(choice);
					alternativ =false;
					break;
					
				default:
					
					System.out.println("error");
					break;
				}
				
		}
		input.close();
	}
		
	public static void main(String []args) {
		programSkelett program = new programSkelett();
		program.runCommando();
		
		
			
	}
		
		
	
		
				
		
		
	
	
	

		
	
		
	

}
