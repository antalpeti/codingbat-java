package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SumDoubleTest {

  @Autowired
  SumDouble sumDouble;

  @Test
  void testSumDouble_whenInputIs1And2() {
    assertEquals(3, sumDouble.sumDouble(1, 2));
  }

  @Test
  void testSumDouble_whenInputIs3And2() {
    assertEquals(5, sumDouble.sumDouble(3, 2));
  }

  @Test
  void testSumDouble_whenInputIs2And2() {
    assertEquals(8, sumDouble.sumDouble(2, 2));
  }

  @Test
  void testSumDouble_whenInputIsMinus1And0() {
    assertEquals(-1, sumDouble.sumDouble(-1, 0));
  }

  @Test
  void testSumDouble_whenInputIs3And3() {
    assertEquals(12, sumDouble.sumDouble(3, 3));
  }

  @Test
  void testSumDouble_whenInputIs0And0() {
    assertEquals(0, sumDouble.sumDouble(0, 0));
  }

  @Test
  void testSumDouble_whenInputIs0And1() {
    assertEquals(1, sumDouble.sumDouble(0, 1));
  }

  @Test
  void testSumDouble_whenInputIs3And4() {
    assertEquals(7, sumDouble.sumDouble(3, 4));
  }
}

