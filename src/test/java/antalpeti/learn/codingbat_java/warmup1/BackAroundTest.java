package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BackAroundTest {

    @Autowired
    BackAround backAround;

    @Test
    void testBackAround_cat() {
        assertEquals("tcatt", backAround.backAround("cat"));
    }

    @Test
    void testBackAround_Hello() {
        assertEquals("oHelloo", backAround.backAround("Hello"));
    }

    @Test
    void testBackAround_a() {
        assertEquals("aaa", backAround.backAround("a"));
    }

    @Test
    void testBackAround_abc() {
        assertEquals("cabcc", backAround.backAround("abc"));
    }

    @Test
    void testBackAround_read() {
        assertEquals("dreadd", backAround.backAround("read"));
    }

    @Test
    void testBackAround_boo() {
        assertEquals("obooo", backAround.backAround("boo"));
    }
}

