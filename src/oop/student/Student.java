package oop.student;
// Skapa en klass Student: Konstruktorn ska ta in namn och årskurs.
// Skapa en metod promote som ökar årskursen med. Skapa en metod
// som skriver ut vilket stadie man går på (Lågstadiet, mellanstadiet osv.)

public class Student {

    // Attribut
    private String name;
    private int grade;


    // Konstruktorn
    public Student (String name, int grade) {

        this.name = name;
        this.grade = grade;
    }

    // Skapa metod för att hämta namn och
    public String getName () {

        return name;
    }

    // Metod för årskurs och uppdatering av det
    public int getGrade () {

        return grade;
    }

    public void promoteGrade () {

        grade +=1;
    }

    // Metod för stadie
    public void printStadie() {

        if (grade <= 3 && grade >=1) {

            System.out.println("lågstudiet");

        } else if (grade <= 6 && grade >=4) {

            System.out.println("mellanstadiet");

        } else if (grade <= 9 && grade >=7) {

            System.out.println("högstadiet");

        } else {

            System.out.println("annat stadiet");

        }

    }

}
