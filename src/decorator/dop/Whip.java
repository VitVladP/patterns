package decorator.dop;

import decorator.abst.Beverage;
import decorator.abst.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double coast() {
        return .10 + beverage.coast();
    }
}
