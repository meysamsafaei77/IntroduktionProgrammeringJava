package oop.student;
// Skapa ett Student-objekt och låt det gå upp en årskurs i main-metoden.
// Skriv ut årskurs och stadie ifrån Main metoden.

public class StudentMain {

    public static void main(String[] args) {

        // Objekt student
        Student myStudent1 = new Student("Anna", 2);
        Student myStudent2 = new Student("Oliver", 5);
        Student myStudent3 = new Student("Ali", 8);
        Student myStudent4 = new Student("Alice", 11);

        //Anropa metod name och grade
        String name1 = myStudent1.getName();
        int grade1 = myStudent1.getGrade();
        String name2 = myStudent2.getName();
        int grade2 = myStudent2.getGrade();
        String name3 = myStudent3.getName();
        int grade3 = myStudent3.getGrade();
        String name4 = myStudent4.getName();
        int grade4 = myStudent4.getGrade();

        // Anropa metod promoteGrade
        myStudent1.promoteGrade();
        myStudent2.promoteGrade();
        myStudent3.promoteGrade();
        myStudent4.promoteGrade();

        // Uppdatera årskurs
        int grade11 = myStudent1.getGrade();
        int grade22 = myStudent2.getGrade();
        int grade33 = myStudent3.getGrade();
        int grade44 = myStudent4.getGrade();

        // Skriv ut namn och årskurs för studenter
        // Anropa metod prinStadie
        System.out.println("Namn: "+ name1 + " Årskurs: "+grade1);
        System.out.println("Nu går "+ name1 + " på årskurs: "+grade11);
        System.out.print(name1+" ligger på "); myStudent1.printStadie();
        System.out.println();

        System.out.println("Namn: "+ name2 + " Årskurs: "+grade2);
        System.out.println("Nu går "+ name2 + " på årskurs: "+grade22);
        System.out.print(name2+" ligger på "); myStudent2.printStadie();
        System.out.println();

        System.out.println("Namn: "+ name3 + " Årskurs: "+grade3);
        System.out.println("Nu går "+ name3 + " på årskurs: "+grade33);
        System.out.print(name3+" ligger på "); myStudent3.printStadie();
        System.out.println();

        System.out.println("Namn: "+ name4 + " Årskurs: "+grade4);
        System.out.println("Nu går "+ name4 + " på årskurs: "+grade44);
        System.out.print(name4+" ligger på "); myStudent4.printStadie();

    }

}
