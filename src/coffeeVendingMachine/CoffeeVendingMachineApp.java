package coffeeVendingMachine;

import java.util.Scanner;

public class CoffeeVendingMachineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeVendingMachineIfce machine = new CoffeeVendingMachine();
		Scanner sc = new Scanner(System.in);
		
		machine: while(true) {
		System.out.println("***************** Coffee Vending Machine *****************\n");
			cType: while(true) {
				System.out.println("======== Type of Coffee ========");
				System.out.println("[1] DarkRoast");
				System.out.println("[2] Espresso");
				System.out.println("[3] House of blend");
				System.out.println("\n[0] Exit");
				System.out.println("================================");
				System.out.print("Enter your choice: ");
				int coffeeType = sc.nextInt();
			
				switch (coffeeType) {
					case 1:
						machine.setCoffee("DARKROAST");
						break cType;
					case 2:
						machine.setCoffee("ESPRESSO");
						break cType;
					case 3:
						machine.setCoffee("HOUSE OF BLEND");
						break cType;
					case 0:
						break machine;
				
					default:
						System.out.println("Invalid input, please enter again: ");
						continue;
				}
			}
		
			cSize: while(true) {
				System.out.println("======== Size of Coffee ========");
				System.out.println("[1] TALL");
				System.out.println("[2] GRANDE");
				System.out.println("[3] VENTI");
				System.out.println("\n[0] Exit");
				System.out.println("================================");
				System.out.print("Enter your choice: ");
				int sizeCoffee = sc.nextInt();
			
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
				
					case 0:
						break machine;
				
					default:
						System.out.println("Invalid input, please enter again: ");
						continue;
				}
			}
		
			cTopping: while(true) {
				System.out.println("=========== Toppings ===========");
				System.out.println("[1] Milk");
				System.out.println("[2] Soy");
				System.out.println("[3] Mocha");
				System.out.println("[4] Whip");
				System.out.println("[5] No Topping");
				System.out.println("\n[6] Confirm Toppings");
				System.out.println("[0] Exit");
				System.out.println("================================");
				System.out.print("Enter your choice: ");
			
				int topping = sc.nextInt();
			
				switch (topping) {
					case 1:
						machine.addTopping("MILK");
						continue;
				
					case 2:
						machine.addTopping("SOY");
						continue;
				
					case 3:
						machine.addTopping("MOCHA");
						continue;
				
					case 4:
						machine.addTopping("WHIP");
						continue;
				
					case 5:
						break cTopping;
				
					case 6:
						break cTopping;
						
					case 0:
						break machine;
				
					default:
						System.out.println("Invalid input, please enter again: ");
						continue;
				}
			}
		
			placeOrder: while(true) {
				System.out.println("\n\n========= Your Coffee ==========");
				System.out.println(machine.getCoffee());
				System.out.println("\n[1] Confirm and Place Order");
				System.out.println("[0] Exit");
				System.out.println("================================");
				System.out.print("Enter your choice: ");
			
				int choice = sc.nextInt();
			
				switch (choice) {
					case 1:
						machine.placeOrder();
						break placeOrder;
				
					case 0:
						break machine;
				
					default:
						System.out.println("Invalid input, please enter again: ");
						continue;
				}
			}
		}
	}
}
