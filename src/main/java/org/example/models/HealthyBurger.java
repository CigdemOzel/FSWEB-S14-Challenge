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
        double totalPrice = super.itemizeHamburger();  // Bu, ana hamburger fiyatını alır

        if (healthyExtra1Name != null && healthyExtra1Price > 0) {
            System.out.println(healthyExtra1Name + " : " + healthyExtra1Price);
            totalPrice += healthyExtra1Price;  // Ekstra 1 fiyatı ekleniyor
        }

        if (healthyExtra2Name != null && healthyExtra2Price > 0) {
            System.out.println(healthyExtra2Name + " : " + healthyExtra2Price);
            totalPrice += healthyExtra2Price;  // Ekstra 2 fiyatı ekleniyor
        }

        System.out.println("Total price: " + totalPrice);  // Toplam fiyat yazdırılıyor
        return totalPrice;
    }
}
