package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Front22Test {
    @Autowired
    Front22 front22;

    @Test
    void returnsKiKittenKiForKitten() {
        assertEquals("kikittenki", front22.front22("kitten"));
    }

    @Test
    void returnsHaHaHaForHa() {
        assertEquals("HaHaHa", front22.front22("Ha"));
    }

    @Test
    void returnsAbAbcAbForAbc() {
        assertEquals("ababcab", front22.front22("abc"));
    }

    @Test
    void returnsAbAbAbForAb() {
        assertEquals("ababab", front22.front22("ab"));
    }

    @Test
    void returnsAaaForA() {
        assertEquals("aaa", front22.front22("a"));
    }

    @Test
    void returnsEmptyForEmptyString() {
        assertEquals("", front22.front22(""));
    }

    @Test
    void returnsLoLogicLoForLogic() {
        assertEquals("LoLogicLo", front22.front22("Logic"));
    }
}

