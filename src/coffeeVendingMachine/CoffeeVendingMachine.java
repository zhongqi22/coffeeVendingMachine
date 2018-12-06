package coffeeVendingMachine;

public class CoffeeVendingMachine implements CoffeeVendingMachineIfce{
	Beverage coffee;
	
	public void setCoffee(String c) {
		switch(c) {
			case "HOUSEBLEND":
				coffee = new HouseBlend();
				break;
				
			case "ESPRESSO":
				coffee = new Espresso();
				break;
				
			case "DARKROAST":
				coffee = new DarkRoast();
				break;
		}
		System.out.println("\n------> "  + coffee.getDescription() + "\n");
	}
	
	public void setSize(String size) {
		coffee.setSize(size);
		System.out.println("\n------> "  + coffee.getDescription() + "\n");
	}
	
	public Beverage getCoffee() {
		return coffee;
	}
	
	public void addTopping(String topping) {
		switch(topping) {
			case "MILK":
				coffee = new Milk(coffee);
				break;
			
			case "MOCHA":
				coffee = new Mocha(coffee);
				break;
				
			case "SOY":
				coffee = new Soy(coffee);
				break;
				
			case "WHIP":
				coffee = new Whip(coffee);
				break;
		}
		System.out.println("\n------> "  + coffee.getDescription() + "\n");
	}
	
	public void placeOrder() throws InterruptedException {
		System.out.println("\n\nDispensing cup...");
		Thread.sleep(1000);
		System.out.println("Filling it up with coffee...");
		Thread.sleep(1000);
		System.out.println("Adding Topping...");
		Thread.sleep(1000);
		System.out.println("There you go!\n");
	}
}
