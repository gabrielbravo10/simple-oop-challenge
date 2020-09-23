public class DeluxeBurger extends BasicBurger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 14.54);
        super.addBurgerAdditional1("Chips", 2.75);
        super.addBurgerAdditional2("Drink", 1.81);
    }

    @Override
    public void addBurgerAdditional1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addBurgerAdditional2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addBurgerAdditional3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addBurgerAdditional4(String name, double price) {
        super.addBurgerAdditional4(name, price);
    }
}
