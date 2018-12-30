package strategy.quack;

public class Quack implements QuackeBihevior {
    @Override
    public void quack() {
        System.out.println("strategy/quack");
    }
}
