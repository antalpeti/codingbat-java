package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IcyHotTest {
    @Autowired
    IcyHot icyHot;

    @Test
    void returnsFalseForMinus1AndMinus1() {
        assertFalse(icyHot.icyHot(-1, -1));
    }

    @Test
    void returnsFalseFor0And0() {
        assertFalse(icyHot.icyHot(0, 0));
    }

    @Test
    void returnsFalseForMinus1And100() {
        assertFalse(icyHot.icyHot(-1, 100));
    }

    @Test
    void returnsFalseFor100AndMinus1() {
        assertFalse(icyHot.icyHot(100, -1));
    }

    @Test
    void returnsFalseFor0And100() {
        assertFalse(icyHot.icyHot(0, 100));
    }

    @Test
    void returnsFalseFor100And0() {
        assertFalse(icyHot.icyHot(100, 0));
    }

    @Test
    void returnsFalseFor0And101() {
        assertFalse(icyHot.icyHot(0, 101));
    }

    @Test
    void returnsFalseFor101And0() {
        assertFalse(icyHot.icyHot(101, 0));
    }

    @Test
    void returnsFalseFor100And100() {
        assertFalse(icyHot.icyHot(100, 100));
    }

    @Test
    void returnsFalseFor101And101() {
        assertFalse(icyHot.icyHot(101, 101));
    }
}

