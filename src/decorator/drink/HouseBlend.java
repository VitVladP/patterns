package decorator.drink;

import decorator.abst.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
       descriprion = "House Blend Coffee";
   }

   @Override
   public double coast () {
       return .89;
   }
}
