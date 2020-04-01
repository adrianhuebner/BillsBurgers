package ooptTest;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White Bread");
	    double price = hamburger.itemizeHamburger();
	    hamburger.addAdditionOne("Cheese", 0.75);
	    hamburger.addAdditionTwo("Pickles", .50);
	    hamburger.addAdditionThree("Secret Sauce", 1.00);
	    hamburger.addAdditionFour("Lettuce", .25);

	    HealthyBurger healthyBurger = new HealthyBurger("Chicken", 4.50);
	    healthyBurger.addHealthyExtraOne("Turkey Bacon", 1.50);
	    healthyBurger.addHealthyExtraTwo("Avocado", 1.75);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.itemizeHamburger();
    }
}
