package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HasTeenTest {

    @Autowired
    HasTeen hasTeen;

    @Test
    void testHasTeen_13_20_10() {
        Assertions.assertTrue(hasTeen.hasTeen(13, 20, 10));
    }

    @Test
    void testHasTeen_20_19_10() {
        Assertions.assertTrue(hasTeen.hasTeen(20, 19, 10));
    }

    @Test
    void testHasTeen_20_10_13() {
        Assertions.assertTrue(hasTeen.hasTeen(20, 10, 13));
    }

    @Test
    void testHasTeen_1_20_12() {
        Assertions.assertFalse(hasTeen.hasTeen(1, 20, 12));
    }

    @Test
    void testHasTeen_19_20_12() {
        Assertions.assertTrue(hasTeen.hasTeen(19, 20, 12));
    }

    @Test
    void testHasTeen_12_20_19() {
        Assertions.assertTrue(hasTeen.hasTeen(12, 20, 19));
    }

    @Test
    void testHasTeen_12_9_20() {
        Assertions.assertFalse(hasTeen.hasTeen(12, 9, 20));
    }

    @Test
    void testHasTeen_12_18_20() {
        Assertions.assertTrue(hasTeen.hasTeen(12, 18, 20));
    }

    @Test
    void testHasTeen_14_2_20() {
        Assertions.assertTrue(hasTeen.hasTeen(14, 2, 20));
    }

    @Test
    void testHasTeen_4_2_20() {
        Assertions.assertFalse(hasTeen.hasTeen(4, 2, 20));
    }

    @Test
    void testHasTeen_11_22_22() {
        Assertions.assertFalse(hasTeen.hasTeen(11, 22, 22));
    }

    @Test
    void testHasTeen_13_15_22() {
        Assertions.assertTrue(hasTeen.hasTeen(13, 15, 22));
    }

    @Test
    void testHasTeen_13_12_18() {
        Assertions.assertTrue(hasTeen.hasTeen(13, 12, 18));
    }

    @Test
    void testHasTeen_11_14_18() {
        Assertions.assertTrue(hasTeen.hasTeen(11, 14, 18));
    }

    @Test
    void testHasTeen_13_16_19() {
        Assertions.assertTrue(hasTeen.hasTeen(13, 16, 19));
    }
}

