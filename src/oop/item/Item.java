package oop.item;
// Skapa en klass Item: Konstruktorn ska ta in ett namn och ett pris.
// Skapa en metod applyDiscount som tar in en procent
// och sänker priset med den procentsatsen.

public class Item {
    // Attribut
    private String name;
    private double price;

    // Konstruktorn
    public Item(String name, double price) {
        this.price = price;
        this.name = name;
    }

    // Metod för hämta ut namn och pris
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Metod för rabatt
    public void applyDiscount(double percentage) {
        price = price- price*percentage/100;
    }

}
