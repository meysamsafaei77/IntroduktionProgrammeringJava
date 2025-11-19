package exersice5;
//Hello World
//Vi skapar en ny klass HelloWorldPrinter som kan skriva ut Hello World!
//Vi anropar denna nya klass ifrån HelloWorld

public class HelloWorldPrinter {

    public void print() {

        System.out.println("Hello World!");
        System.out.println();
    }

    public void printManyTimes(int times) {

        for (int i = 1; i <=times ; i++) {

            System.out.println("Hello world!");
        }
    }


}
