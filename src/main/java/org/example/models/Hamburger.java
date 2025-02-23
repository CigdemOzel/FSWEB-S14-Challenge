package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;


    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;

        if(addition1Price > 0) {
            System.out.println(addition1Name + addition1Price);
            totalPrice += addition1Price;
        }
        if(addition2Price > 0) {
            System.out.println(addition2Name + addition2Price);
            totalPrice += addition2Price;
        }if(addition3Price > 0) {
            System.out.println(addition3Name + addition3Price);
            totalPrice += addition3Price;
        }if(addition4Price > 0) {
            System.out.println(addition4Name + addition4Price);
            totalPrice += addition4Price;
        }

        System.out.println(totalPrice);
        return totalPrice;
    }

}
