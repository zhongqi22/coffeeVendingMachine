package coffeeVendingMachine;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage bvrg){
        beverage = bvrg;
    }
    
    public String getDescription(){
        return beverage.getDescription() + " + Whip";
    }
    
    @Override
    public double cost(){
        double cost = 0.0;
        switch (beverage.getSize()){
            case "TALL":
                cost = 0.1;
                break;
                
            case "GRANDE":
                cost = 0.15;
                break;
                
            case "VENTI":
                cost = 0.2;
                break;
        }
        return cost + beverage.cost();
    }
}
