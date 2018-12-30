package strategy.fly;

public class FlyRocketPowered implements FlyBihavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!!!");
    }
}
