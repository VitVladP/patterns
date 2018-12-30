package strategy.quack;

public class MuteQuack implements QuackeBihevior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
