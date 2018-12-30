package strategy;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBihavior(new FlyRocketPowered());

        model.performFly();
        model.swim();
    }
}
