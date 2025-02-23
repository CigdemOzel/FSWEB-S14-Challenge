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
        return itemizeHamburger();
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
        this.price += price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        this.price += price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;
    }

    public double itemizeHamburger() {
        System.out.println(this.name);
        System.out.println(this.meat);
        System.out.println(this.breadRollType);

        if (addition1Name != null) {
            System.out.println(this.addition1Name);
        }
        if (addition2Name != null) {
            System.out.println(this.addition2Name);
        }
        if (addition3Name != null) {
            System.out.println(this.addition3Name);
        }
        if (addition4Name != null) {
            System.out.println(this.addition4Name);
        }

        System.out.println(this.price);  // Fiyat zaten hesaplandığı için tekrar ekleme yok!
        return this.price;
    }

}
