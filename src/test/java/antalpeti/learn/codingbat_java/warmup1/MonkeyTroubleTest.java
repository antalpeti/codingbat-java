package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MonkeyTroubleTest {
    @Test
    void testBothSmile() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertTrue(mt.monkeyTrouble(true, true));
    }

    @Test
    void testNeitherSmile() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertTrue(mt.monkeyTrouble(false, false));
    }

    @Test
    void testFirstSmilesSecondNot() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertFalse(mt.monkeyTrouble(true, false));
    }

    @Test
    void testFirstNotSmilingSecondIs() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertFalse(mt.monkeyTrouble(false, true));
    }
}
