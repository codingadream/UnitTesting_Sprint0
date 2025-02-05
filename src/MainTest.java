import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void twoPlusThree(){
        var calculator = new Main();
        assertEquals(5,calculator.add(2,3));

    }

    @Test
    void fourMinusThree(){
        var calculator = new Main();
        assertEquals(1,calculator.subtract(4,3));

    }
}