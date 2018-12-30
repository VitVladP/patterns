package strategy.duck;

import strategy.fly.FlyWithWing;
import strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBihavior = new FlyWithWing();
        quackeBihevior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real MallardDuck");
    }
}
