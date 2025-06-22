package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Makes10Test {
  @Autowired
  private Makes10 makes10;

  @Test
  void testMakes10_whenFirstIsNineSecondIsTen() {
    assertTrue(makes10.makes10(9, 10));
  }

  @Test
  void testMakes10_whenBothAreNine() {
    assertFalse(makes10.makes10(9, 9));
  }

  @Test
  void testMakes10_whenFirstIsOneSecondIsNine() {
    assertTrue(makes10.makes10(1, 9));
  }

  @Test
  void testMakes10_whenFirstIsTenSecondIsOne() {
    assertTrue(makes10.makes10(10, 1));
  }

  @Test
  void testMakes10_whenBothAreTen() {
    assertTrue(makes10.makes10(10, 10));
  }

  @Test
  void testMakes10_whenFirstIsEightSecondIsTwo() {
    assertTrue(makes10.makes10(8, 2));
  }

  @Test
  void testMakes10_whenFirstIsEightSecondIsThree() {
    assertFalse(makes10.makes10(8, 3));
  }

  @Test
  void testMakes10_whenFirstIsTenSecondIsFortyTwo() {
    assertTrue(makes10.makes10(10, 42));
  }

  @Test
  void testMakes10_whenFirstIsTwelveSecondIsMinusTwo() {
    assertTrue(makes10.makes10(12, -2));
  }

  @Test
  void testMakes10_whenFirstIsNegativeFiveSecondIsThree() {
    assertFalse(makes10.makes10(-5, 3));
  }

  @Test
  void testMakes10_whenFirstIsNegativeTenSecondIsTwenty() {
    assertTrue(makes10.makes10(-10, 20));
  }

  @Test
  void testMakes10_whenFirstIsNegativeTwoSecondIsTwelve() {
    assertTrue(makes10.makes10(-2, 12));
  }
}
