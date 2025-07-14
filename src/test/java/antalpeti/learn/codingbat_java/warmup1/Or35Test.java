package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Or35Test {
    @Autowired
    Or35 or35;

    @Test
    void returnsTrueFor3() {
        assertTrue(or35.or35(3));
    }

    @Test
    void returnsTrueFor10() {
        assertTrue(or35.or35(10));
    }

    @Test
    void returnsFalseFor8() {
        assertFalse(or35.or35(8));
    }

    @Test
    void returnsTrueFor15() {
        assertTrue(or35.or35(15));
    }

    @Test
    void returnsTrueFor5() {
        assertTrue(or35.or35(5));
    }

    @Test
    void returnsTrueFor9() {
        assertTrue(or35.or35(9));
    }

    @Test
    void returnsFalseFor4() {
        assertFalse(or35.or35(4));
    }

    @Test
    void returnsFalseFor7() {
        assertFalse(or35.or35(7));
    }

    @Test
    void returnsTrueFor6() {
        assertTrue(or35.or35(6));
    }

    @Test
    void returnsFalseFor17() {
        assertFalse(or35.or35(17));
    }

    @Test
    void returnsTrueFor18() {
        assertTrue(or35.or35(18));
    }

    @Test
    void returnsFalseFor29() {
        assertFalse(or35.or35(29));
    }

    @Test
    void returnsTrueFor20() {
        assertTrue(or35.or35(20));
    }

    @Test
    void returnsTrueFor21() {
        assertTrue(or35.or35(21));
    }

    @Test
    void returnsFalseFor22() {
        assertFalse(or35.or35(22));
    }

    @Test
    void returnsTrueFor45() {
        assertTrue(or35.or35(45));
    }

    @Test
    void returnsTrueFor99() {
        assertTrue(or35.or35(99));
    }

    @Test
    void returnsTrueFor100() {
        assertTrue(or35.or35(100));
    }

    @Test
    void returnsFalseFor101() {
        assertFalse(or35.or35(101));
    }

    @Test
    void returnsFalseFor121() {
        assertFalse(or35.or35(121));
    }

    @Test
    void returnsFalseFor122() {
        assertFalse(or35.or35(122));
    }

    @Test
    void returnsTrueFor123() {
        assertTrue(or35.or35(123));
    }
}
