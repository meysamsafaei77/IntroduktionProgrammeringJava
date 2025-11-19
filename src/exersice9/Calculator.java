package exersice9;

public class Calculator {

    private int frist,secend;

    // konstruktorn
    public Calculator(int frist, int secend) {

        this.frist = frist;
        this.secend = secend;
    }

    public int add() {

        return frist + secend;
    }
}
