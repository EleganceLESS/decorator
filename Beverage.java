public abstract class Beverage{
    String description = "Beverage";
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;
    final double milkCost = 0.1;
    final double soyCost = 0.15;
    final double mochaCost = 0.2;
    final double whipCost = 0.1;


    public String getDescription(){
        return description;
    }

    public double cost(){
        double result = 0.0;

        if( hasMilk() ){
            result += milkCost;
        }
        if( hasSoy() ){
            result += soyCost;
        }
        if( hasMocha() ){
            result += mochaCost;
        }
        if( hasWhip() ){
            result += whipCost;
        }

        return result;
    }

    public boolean hasMilk(){
        return milk;
    }

    public void setMilk(boolean milk){
        this.milk = milk;
    }

    public boolean hasSoy(){
        return soy;
    }

    public void setSoy(boolean soy){
        this.soy = soy;
    }

    public boolean hasMocha(){
        return mocha;
    }

    public void setMocha(boolean mocha){
        this.mocha = mocha;
    }

    public boolean hasWhip(){
        return whip;
    }

    public void setWhip(boolean whip){
        this.whip = whip;
    }
}
