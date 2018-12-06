package coffeeVendingMachine;

public abstract class Beverage {
	String description = "Unknown Beverage";
    String size = "";
    
    public String getDescription(){
        return size + " " + description;
    }
    
    public void setSize(String s){
        size = s;
    }
    
    public String getSize(){
        return size;
    }
    
    public String getName() {
    	return description;
    }
    
    public abstract double cost();
    
    public String toString() {
    	return getDescription() + " \nPrice: RM" + String.format( "%.2f", cost() );
    }
}
