package coffeeVendingMachine;

public class Soy extends CondimentDecorator{
    Beverage beverage;
    
    public Soy(Beverage bvrg){
        beverage = bvrg;
    }
    
    public String getDescription(){
        return beverage.getDescription() + " + Soy";
    }
    
    @Override
    public double cost(){
        double cost = 0.0;
        switch (beverage.getSize()){
            case "TALL":
                cost = 0.15;
                break;
                
            case "GRANDE":
                cost = 0.2;
                break;
                
            case "VENTI":
                cost = 0.25;
                break;
        }
        return cost + beverage.cost();
    }
    
}
