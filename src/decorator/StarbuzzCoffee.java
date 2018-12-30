package decorator;

import decorator.abst.Beverage;
import decorator.dop.Mocha;
import decorator.dop.Soy;
import decorator.dop.Whip;
import decorator.drink.DarkRoast;
import decorator.drink.Espresso;
import decorator.drink.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println("----------- order 1 --------------");
        System.out.println(beverage.getDescription() +
                " & " + beverage.coast());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println("----------- order 2 --------------");
        System.out.println(beverage2.getDescription() +
                " & " + beverage2.coast());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println("----------- order 3 --------------");
        System.out.println(beverage3.getDescription() +
                " & " + beverage3.coast());
    }
}
