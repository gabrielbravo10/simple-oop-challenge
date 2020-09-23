public class main {

    public static void main(String[] args) {

        BasicBurger bscBurger = new BasicBurger("Basic", "White", "Sausage", 3.56);
        double price = bscBurger.itemizeBurger();
        bscBurger.addBurgerAdditional1("Tomato", 0.27);
        bscBurger.addBurgerAdditional2("Lettuce", 0.75);
        bscBurger.addBurgerAdditional3("Cheese", 1.13);
        System.out.println("Total Burger price is " + bscBurger.itemizeBurger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addBurgerAdditional1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeBurger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeBurger();
    }
}
