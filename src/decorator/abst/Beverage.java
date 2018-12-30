package decorator.abst;

public abstract class Beverage {
   public String descriprion = "unknown Beverage";

    public String getDescription() {
        return  descriprion;
    }

    public abstract double coast();
}
