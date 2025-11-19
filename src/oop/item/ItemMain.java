package oop.item;
//Skapa ett Item-objekt i main, applicera en rabatt och visa det nya priset.

public class ItemMain {

    public static void main(String[] args) {

        // Objekt
        Item myItem = new Item("Paraply", 99);

        // Anropa metoderna och skriv ut resultatet
        System.out.println("Varan " + myItem.getName() + " kostar " + myItem.getPrice());

        myItem.applyDiscount(10);
        System.out.println("Varan " + myItem.getName() + " kostar efter prissänkning " + myItem.getPrice());

        System.out.println();
        System.out.println("Vara har fått 15% extra rabatt idag ");
        myItem.applyDiscount(15);
        System.out.println("Varan " + myItem.getName() + " kostar efter prissänkning " + myItem.getPrice());
    }

}
