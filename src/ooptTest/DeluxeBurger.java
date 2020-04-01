package ooptTest;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.53, "Brioche");
        super.addAdditionOne("French Fries", 3.50);
        super.addAdditionTwo("Drink", 1.82);
    }

    @Override
    public void addAdditionOne(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addAdditionTwo(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addAdditionThree(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addAdditionFour(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
