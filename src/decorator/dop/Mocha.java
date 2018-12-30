package decorator.dop;

import decorator.abst.Beverage;
import decorator.abst.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha (Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double coast() {
        return .20 + beverage.coast();
    }
}
