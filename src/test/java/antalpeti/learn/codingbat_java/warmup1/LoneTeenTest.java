package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoneTeenTest {

    @Autowired
    LoneTeen loneTeen;

    @Test
    void returnsTrue_whenFirstIsTeenAndSecondIsNot_13_99() {
        Assertions.assertTrue(loneTeen.loneTeen(13, 99));
    }

    @Test
    void returnsTrue_whenSecondIsTeenAndFirstIsNot_21_19() {
        Assertions.assertTrue(loneTeen.loneTeen(21, 19));
    }

    @Test
    void returnsFalse_whenBothAreTeen_13_13() {
        Assertions.assertFalse(loneTeen.loneTeen(13, 13));
    }

    @Test
    void returnsTrue_whenFirstIsTeenAndSecondIsNot_14_20() {
        Assertions.assertTrue(loneTeen.loneTeen(14, 20));
    }

    @Test
    void returnsTrue_whenSecondIsTeenAndFirstIsNot_20_15() {
        Assertions.assertTrue(loneTeen.loneTeen(20, 15));
    }

    @Test
    void returnsFalse_whenBothAreTeen_16_17() {
        Assertions.assertFalse(loneTeen.loneTeen(16, 17));
    }

    @Test
    void returnsTrue_whenFirstIsTeenAndSecondIsNot_16_9() {
        Assertions.assertTrue(loneTeen.loneTeen(16, 9));
    }

    @Test
    void returnsFalse_whenBothAreTeen_16_18() {
        Assertions.assertFalse(loneTeen.loneTeen(16, 18));
    }

    @Test
    void returnsFalse_whenBothAreTeen_13_19() {
        Assertions.assertFalse(loneTeen.loneTeen(13, 19));
    }

    @Test
    void returnsTrue_whenFirstIsTeenAndSecondIsNot_13_20() {
        Assertions.assertTrue(loneTeen.loneTeen(13, 20));
    }

    @Test
    void returnsTrue_whenSecondIsTeenAndFirstIsNot_6_18() {
        Assertions.assertTrue(loneTeen.loneTeen(6, 18));
    }

    @Test
    void returnsTrue_whenSecondIsTeenAndFirstIsNot_99_13() {
        Assertions.assertTrue(loneTeen.loneTeen(99, 13));
    }

    @Test
    void returnsFalse_whenNeitherIsTeen_99_99() {
        Assertions.assertFalse(loneTeen.loneTeen(99, 99));
    }
}
