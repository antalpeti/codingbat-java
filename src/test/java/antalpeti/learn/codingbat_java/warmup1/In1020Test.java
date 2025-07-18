package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class In1020Test {

    @Autowired
    In1020 in1020;

    @Test
    void testIn1020_12_99() {
        Assertions.assertTrue(in1020.in1020(12, 99));
    }

    @Test
    void testIn1020_21_12() {
        Assertions.assertTrue(in1020.in1020(21, 12));
    }

    @Test
    void testIn1020_8_99() {
        Assertions.assertFalse(in1020.in1020(8, 99));
    }

    @Test
    void testIn1020_99_10() {
        Assertions.assertTrue(in1020.in1020(99, 10));
    }

    @Test
    void testIn1020_20_20() {
        Assertions.assertTrue(in1020.in1020(20, 20));
    }

    @Test
    void testIn1020_21_21() {
        Assertions.assertFalse(in1020.in1020(21, 21));
    }

    @Test
    void testIn1020_9_9() {
        Assertions.assertFalse(in1020.in1020(9, 9));
    }
}

