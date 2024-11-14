package NumeroArmstrongApp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArmstrongCheckTest {
    @Test
    void test371IsArmstrong() {
        ArmstrongCheck checker = new ArmstrongCheck(371);
        assertTrue(checker.IsArmstrong(), "El número 371 debería ser de Armstrong.");
    }

    @Test
    void test1634IsArmstrong() {
        
        ArmstrongCheck checker = new ArmstrongCheck(1634);
        assertTrue(checker.IsArmstrong(), "El número 1634 debería ser de Armstrong.");
    }

    @Test
    void test351IsArmstrong() {
        ArmstrongCheck checker = new ArmstrongCheck(351);
        assertFalse(checker.IsArmstrong(), "El número 351 no debería ser de Armstrong.");
    }

    @Test
    void test2015IsArmStrong() {
        ArmstrongCheck checker = new ArmstrongCheck(2015);
        assertFalse(checker.IsArmstrong(), "El número 2015 no debería ser de Armstrong.");
    }
}


    

    

