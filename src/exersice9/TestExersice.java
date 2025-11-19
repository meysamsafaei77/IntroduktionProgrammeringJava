package exersice9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExersice {

    @Test
    public void fristTestCase() {

        String text = "some text";
        int actual = text.length();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void add() {

        //Arrange
        Calculator calc = new Calculator(2,3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);


    }

}
