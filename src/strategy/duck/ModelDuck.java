package strategy.duck;

import strategy.fly.FlyNoWay;
import strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBihavior = new FlyNoWay();
        quackeBihevior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(" I am a real modern strategy.duck");
    }
}
