package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StartHiTest {
    @Autowired
    StartHi startHi;

    @Test
    void returnsTrueForHiThere() {
        assertTrue(startHi.startHi("hi there"));
    }

    @Test
    void returnsTrueForHi() {
        assertTrue(startHi.startHi("hi"));
    }

    @Test
    void returnsFalseForHelloHi() {
        assertFalse(startHi.startHi("hello hi"));
    }

    @Test
    void returnsFalseForHe() {
        assertFalse(startHi.startHi("he"));
    }

    @Test
    void returnsFalseForH() {
        assertFalse(startHi.startHi("h"));
    }

    @Test
    void returnsFalseForEmptyString() {
        assertFalse(startHi.startHi(""));
    }

    @Test
    void returnsFalseForHoHi() {
        assertFalse(startHi.startHi("ho hi"));
    }

    @Test
    void returnsTrueForHiHo() {
        assertTrue(startHi.startHi("hi ho"));
    }
}

