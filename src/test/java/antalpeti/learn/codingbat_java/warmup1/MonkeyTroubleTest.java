package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MonkeyTroubleTest {
    @Autowired
    MonkeyTrouble monkeyTrouble;

    @Test
    void testBothSmile() {
        assertTrue(monkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    void testNeitherSmile() {
        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
    }

    @Test
    void testFirstSmilesSecondNot() {
        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
    }

    @Test
    void testFirstNotSmilingSecondIs() {
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }
}
