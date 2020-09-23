public class BasicBurger {

    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String adt1;
    private double adt1Price;

    private String adt2;
    private double adt2Price;

    private String adt3;
    private double adt3Price;

    private String adt4;
    private double adt4Price;


    public BasicBurger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addBurgerAdditional1(String name, double price) {
        this.adt1 = name;
        this.adt1Price = price;
    }

    public void addBurgerAdditional2(String name, double price) {
        this.adt2 = name;
        this.adt2Price = price;
    }

    public void addBurgerAdditional3(String name, double price) {
        this.adt3 = name;
        this.adt3Price = price;
    }

    public void addBurgerAdditional4(String name, double price) {
        this.adt4 = name;
        this.adt4Price = price;
    }


    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadType + " roll " + "with "
                + this.meat + ", price is " + this.price);

        if (this.adt1 != null) {
            burgerPrice += this.adt1Price;
            System.out.println("Added" + this.adt1 + " for an extra " + this.adt1Price);
        }

        if (this.adt2 != null) {
            burgerPrice += this.adt2Price;
            System.out.println("Added" + this.adt2 + " for an extra " + this.adt2Price);
        }

        if (this.adt3 != null) {
            burgerPrice += this.adt3Price;
            System.out.println("Added" + this.adt3 + " for an extra " + this.adt3Price);
        }

        if (this.adt4 != null) {
            burgerPrice += this.adt4Price;
            System.out.println("Added" + this.adt4 + " for an extra " + this.adt4Price);
        }

        return burgerPrice;
    }



}
