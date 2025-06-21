package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SumDoubleTest {
    @Autowired
    SumDouble sumDouble;

    @Test
    void testSumDouble_1_2() {
        assertEquals(3, sumDouble.sumDouble(1, 2));
    }

    @Test
    void testSumDouble_3_2() {
        assertEquals(5, sumDouble.sumDouble(3, 2));
    }

    @Test
    void testSumDouble_2_2() {
        assertEquals(8, sumDouble.sumDouble(2, 2));
    }

    @Test
    void testSumDouble_minus1_0() {
        assertEquals(-1, sumDouble.sumDouble(-1, 0));
    }

    @Test
    void testSumDouble_3_3() {
        assertEquals(12, sumDouble.sumDouble(3, 3));
    }

    @Test
    void testSumDouble_0_0() {
        assertEquals(0, sumDouble.sumDouble(0, 0));
    }

    @Test
    void testSumDouble_0_1() {
        assertEquals(1, sumDouble.sumDouble(0, 1));
    }

    @Test
    void testSumDouble_3_4() {
        assertEquals(7, sumDouble.sumDouble(3, 4));
    }
}
