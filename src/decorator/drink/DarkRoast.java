package decorator.drink;

import decorator.abst.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
       descriprion = "Dark Roast";
   }

   @Override
   public double coast () {
       return .99;
   }
}
