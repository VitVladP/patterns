package strategy.duck;

import strategy.fly.FlyBihavior;
import strategy.quack.QuackeBihevior;

public abstract class Duck {
    FlyBihavior flyBihavior;
    QuackeBihevior quackeBihevior;

    public void setFlyBihavior(FlyBihavior flyBihavior) {
        this.flyBihavior = flyBihavior;
    }

    public void setQuackeBihevior(QuackeBihevior quackeBihevior) {
        this.quackeBihevior = quackeBihevior;
    }

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBihavior.fly();
    }

    public void performQuack() {
        quackeBihevior.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim");
    }
}
