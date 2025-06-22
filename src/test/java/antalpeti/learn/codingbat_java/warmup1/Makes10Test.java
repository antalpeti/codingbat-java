package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Makes10Test {
  @Autowired
  private Makes10 makes10;

  @Test
  void testNineTen() {
    assertTrue(makes10.makes10(9, 10));
  }

  @Test
  void testNineNine() {
    assertFalse(makes10.makes10(9, 9));
  }

  @Test
  void testOneNine() {
    assertTrue(makes10.makes10(1, 9));
  }

  @Test
  void testTenOne() {
    assertTrue(makes10.makes10(10, 1));
  }

  @Test
  void testTenTen() {
    assertTrue(makes10.makes10(10, 10));
  }

  @Test
  void testEightTwo() {
    assertTrue(makes10.makes10(8, 2));
  }

  @Test
  void testEightThree() {
    assertFalse(makes10.makes10(8, 3));
  }

  @Test
  void testTenFortyTwo() {
    assertTrue(makes10.makes10(10, 42));
  }

  @Test
  void testTwelveMinusTwo() {
    assertTrue(makes10.makes10(12, -2));
  }

  @Test
  void testNegativeFirstParameter() {
    assertFalse(makes10.makes10(-5, 3));
    assertTrue(makes10.makes10(-10, 20));
    assertTrue(makes10.makes10(-2, 12));
  }
}
