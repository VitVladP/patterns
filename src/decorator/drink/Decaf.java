package decorator.drink;

import decorator.abst.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
       descriprion = "Decaf";
   }

   @Override
   public double coast () {
       return 1.05;
   }
}
