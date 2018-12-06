package coffeeVendingMachine;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage bvrg){
        beverage = bvrg;
    }
    
    public String getDescription(){
        return beverage.getDescription() + " + Mocha";
    }
    
    @Override
    public double cost(){
        double cost = 0.0;
        switch (beverage.getSize()){
            case "TALL":
                cost = 0.2;
                break;
                
            case "GRANDE":
                cost = 0.25;
                break;
                
            case "VENTI":
                cost = 0.3;
                break;
        }
        return cost + beverage.cost();
    }
}