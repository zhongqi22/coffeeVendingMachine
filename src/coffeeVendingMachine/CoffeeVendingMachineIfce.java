package coffeeVendingMachine;

public interface CoffeeVendingMachineIfce {
	public void setCoffee(String coffee);
	public void setSize(String size);
	public void addTopping(String topping);
	public Beverage getCoffee();
	public void placeOrder();
}
