package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Diff21Test {
    @Autowired
    Diff21 diff21;

    @Test
    void testDiff21_19() {
        assertEquals(2, diff21.diff21(19));
    }

    @Test
    void testDiff21_10() {
        assertEquals(11, diff21.diff21(10));
    }

    @Test
    void testDiff21_21() {
        assertEquals(0, diff21.diff21(21));
    }

    @Test
    void testDiff21_22() {
        assertEquals(2, diff21.diff21(22));
    }

    @Test
    void testDiff21_25() {
        assertEquals(8, diff21.diff21(25));
    }

    @Test
    void testDiff21_30() {
        assertEquals(18, diff21.diff21(30));
    }

    @Test
    void testDiff21_0() {
        assertEquals(21, diff21.diff21(0));
    }

    @Test
    void testDiff21_1() {
        assertEquals(20, diff21.diff21(1));
    }

    @Test
    void testDiff21_2() {
        assertEquals(19, diff21.diff21(2));
    }

    @Test
    void testDiff21_minus1() {
        assertEquals(22, diff21.diff21(-1));
    }

    @Test
    void testDiff21_minus2() {
        assertEquals(23, diff21.diff21(-2));
    }

    @Test
    void testDiff21_50() {
        assertEquals(58, diff21.diff21(50));
    }
}
