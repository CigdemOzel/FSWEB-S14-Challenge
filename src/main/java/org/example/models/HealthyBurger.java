package org.example.models;

public class HealthyBurger extends Hamburger{

    public String healthyExtra1Name;
    public double healthyExtra1Price;
    public String healthyExtra2Name;
    public double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }


    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if(healthyExtra1Name != null) {
            System.out.println(healthyExtra1Name +healthyExtra1Price);
            totalPrice += healthyExtra1Price;
        }

        if(healthyExtra2Name != null) {
            System.out.println(healthyExtra2Name +healthyExtra2Price);
            totalPrice += healthyExtra2Price;
        }

        System.out.println(totalPrice);
        return  totalPrice;

    }
}
