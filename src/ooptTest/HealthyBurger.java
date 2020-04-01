package ooptTest;

public class HealthyBurger extends Hamburger{

    private String healthyExtraOne;
    private double healthyExtraOnePrice;

    private String healthyExtraTwo;
    private double healthyExtraTwoPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyExtraOne(String name, double price){
        this.healthyExtraOne = name;
        this.healthyExtraOnePrice = price;
    }

    public void addHealthyExtraTwo(String name, double price){
        this.healthyExtraTwo = name;
        this.healthyExtraTwoPrice = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtraOne != null){
            hamburgerPrice += healthyExtraOnePrice;
        }
        if(this.healthyExtraTwo != null){
            hamburgerPrice += healthyExtraTwoPrice;
        }
        return hamburgerPrice;
    }
}
