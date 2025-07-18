package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Front3Test {

  @Autowired
  Front3 front3;

    @Test
    void testJava() {
        assertEquals("JavJavJav", front3.front3("Java"));
    }

    @Test
    void testChocolate() {
        assertEquals("ChoChoCho", front3.front3("Chocolate"));
    }

    @Test
    void testAbc() {
        assertEquals("abcabcabc", front3.front3("abc"));
    }

    @Test
    void testAbcXYZ() {
        assertEquals("abcabcabc", front3.front3("abcXYZ"));
    }

    @Test
    void testAb() {
        assertEquals("ababab", front3.front3("ab"));
    }

    @Test
    void testA() {
        assertEquals("aaa", front3.front3("a"));
    }

    @Test
    void testEmpty() {
        assertEquals("", front3.front3(""));
    }
}
