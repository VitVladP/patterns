package strategy.fly;

public class FlyWithWing implements FlyBihavior {
    @Override
    public void fly() {
        System.out.println("I can strategy.fly by wings");
    }
}
