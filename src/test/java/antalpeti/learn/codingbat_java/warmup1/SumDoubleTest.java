package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {
  @Test
  void testSumDouble_1_2() {
    SumDouble sd = new SumDouble();
    assertEquals(3, sd.sumDouble(1, 2));
  }

  @Test
  void testSumDouble_3_2() {
    SumDouble sd = new SumDouble();
    assertEquals(5, sd.sumDouble(3, 2));
  }

  @Test
  void testSumDouble_2_2() {
    SumDouble sd = new SumDouble();
    assertEquals(8, sd.sumDouble(2, 2));
  }

  @Test
  void testSumDouble_minus1_0() {
    SumDouble sd = new SumDouble();
    assertEquals(-1, sd.sumDouble(-1, 0));
  }

  @Test
  void testSumDouble_3_3() {
    SumDouble sd = new SumDouble();
    assertEquals(12, sd.sumDouble(3, 3));
  }

  @Test
  void testSumDouble_0_0() {
    SumDouble sd = new SumDouble();
    assertEquals(0, sd.sumDouble(0, 0));
  }

  @Test
  void testSumDouble_0_1() {
    SumDouble sd = new SumDouble();
    assertEquals(1, sd.sumDouble(0, 1));
  }

  @Test
  void testSumDouble_3_4() {
    SumDouble sd = new SumDouble();
    assertEquals(7, sd.sumDouble(3, 4));
  }
}
