package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MonkeyTroubleTest {
    @Autowired
    MonkeyTrouble monkeyTrouble;

    @Test
    void testMonkeyTrouble_whenBothSmile() {
        assertTrue(monkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    void testMonkeyTrouble_whenNeitherSmiles() {
        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    void testMonkeyTrouble_whenFirstSmilesSecondDoesNot() {
        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
    }

    @Test
    void testMonkeyTrouble_whenFirstDoesNotSmileSecondDoes() {
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }
}

