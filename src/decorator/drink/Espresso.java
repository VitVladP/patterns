package decorator.drink;

import decorator.abst.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
       descriprion = "Espresso";
   }

   @Override
   public double coast () {
       return 1.99;
   }
}
