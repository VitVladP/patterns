package decorator.dop;

import decorator.abst.Beverage;
import decorator.abst.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double coast() {
        return .15 + beverage.coast();
    }
}
