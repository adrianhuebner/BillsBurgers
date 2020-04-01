package ooptTest;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    private String additionOne;
    private double additionOnePrice;

    private String additionTwo;
    private double additionTwoPrice;

    private String additionThree;
    private double additionThreePrice;

    private String additionFour;
    private double additionFourPrice;

    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }

    public void addAdditionOne(String name, double price){
        this.additionOne = name;
        this.additionOnePrice = price;
    }

    public void addAdditionTwo(String name, double price){
        this.additionTwo = name;
        this.additionTwoPrice = price;
    }

    public void addAdditionThree(String name, double price){
        this.additionThree = name;
        this.additionThreePrice = price;
    }

    public void addAdditionFour(String name, double price){
        this.additionFour = name;
        this.additionFourPrice = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRoll + " roll " +
                "price is " + this.price);
        if(this.additionOne != null){
            hamburgerPrice += this.additionOnePrice;
        }
        if(this.additionTwo != null){
            hamburgerPrice += this.additionTwoPrice;
        }
        if(this.additionThree != null){
            hamburgerPrice += this.additionThreePrice;
        }
        if(this.additionFour != null){
            hamburgerPrice += this.additionFourPrice;
        }
        return hamburgerPrice;
    }
}
