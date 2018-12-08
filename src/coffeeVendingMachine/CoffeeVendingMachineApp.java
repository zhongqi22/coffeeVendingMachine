package coffeeVendingMachine;

import java.util.Scanner;

public class CoffeeVendingMachineApp {

	public static void main(String[] args) throws InterruptedException{

		CoffeeVendingMachineIfce machine = new CoffeeVendingMachine();
		Scanner sc = new Scanner(System.in);
		int coffeeType;
		int sizeCoffee;
		int topping=0;
		
		machine: while(true) {
		
		System.out.println("***************** Coffee Vending Machine *****************\n");
			
				System.out.println("Which type of coffee do you want?");
				System.out.println("[1] Dark Roast");
				System.out.println("[2] Espresso");
				System.out.println("[3] House Blend");
				System.out.print("\nEnter your choice (999 to exit system): ");
				coffeeType = sc.nextInt();
				
				cType: while(true) {
				switch (coffeeType) {
					case 1:
						machine.setCoffee("DARKROAST");
						break cType;
					case 2:
						machine.setCoffee("ESPRESSO");
						break cType;
					case 3:
						machine.setCoffee("HOUSEBLEND");
						break cType;
						
					case 999:
						break machine;
				
					default:
						System.out.print("\nInvalid input, please enter again: ");
						coffeeType = sc.nextInt();
						continue;
				}
			}
		
			
				System.out.println("Please choose a size for your coffee.");
				System.out.println("[1] TALL");
				System.out.println("[2] GRANDE");
				System.out.println("[3] VENTI");
				System.out.print("\nEnter your choice (999 to exit system): ");
				sizeCoffee = sc.nextInt();
				
				cSize: while(true) {
				switch (sizeCoffee) {
					case 1:
						machine.setSize("TALL");
						break cSize;
				
					case 2:
						machine.setSize("GRANDE");
						break cSize;
				
					case 3:
						machine.setSize("VENTI");
						break cSize;
						
					case 999:
						break machine;
				
					default:
						System.out.print("\nInvalid input, please enter again:");
						sizeCoffee = sc.nextInt();
						continue;
				}
			}
		

				
				System.out.println("Topping?");
				System.out.println("[1] Milk");
				System.out.println("[2] Soy");
				System.out.println("[3] Mocha");
				System.out.println("[4] Whip");
				System.out.println("\n[5] Skip");
				System.out.println("[0] Confirm Toppings and  Proceed");
				System.out.print("\nEnter your choice (999 to exit system): ");
				topping = sc.nextInt();
				
				cTopping: while(topping!=5 || topping!=0) {

				switch (topping) {
					case 1:
						machine.addTopping("MILK");
						System.out.print("Anymore? ");
						topping = sc.nextInt();
						continue;
				
					case 2:
						machine.addTopping("SOY");
						System.out.print("Anymore? ");
						topping = sc.nextInt();
						continue;
				
					case 3:
						machine.addTopping("MOCHA");
						System.out.print("Anymore? ");
						topping = sc.nextInt();
						continue;
				
					case 4:
						machine.addTopping("WHIP");
						System.out.print("Anymore? ");
						topping = sc.nextInt();
						continue;
				
					case 5:
						break cTopping;
				
					case 0:
						break cTopping;
						
					case 999:
						break machine;
				
					default:
						System.out.print("\nInvalid input, please enter again: ");
						topping = sc.nextInt();
						continue;
				}
			}
		
			placeOrder: while(true) {
				System.out.println("\n\n========= Your Coffee ==========");
				System.out.println(machine.getCoffee());
				System.out.println("\n[0] Confirm and Place Order");
				System.out.println("[1] Cancel");
				System.out.print("\nEnter your choice (999 to exit system): ");
			
				int choice = sc.nextInt();
			
				try {
					switch (choice) {
						case 0:
							machine.placeOrder();
							break placeOrder;
							
						case 1:
							System.out.println("\n\n");
							break placeOrder;
							
						case 999:
							break machine;
							
						default:
							System.out.println("\nInvalid input, please enter again: \n");
							continue;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		sc.close();
		System.out.println("\nShutting down machine...");
		Thread.sleep(1000);
		System.out.println("Exited.");
	}
}
