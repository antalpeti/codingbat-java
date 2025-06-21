package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {
  @Test
  void testDiff21_19() {
    Diff21 d = new Diff21();
    assertEquals(2, d.diff21(19));
  }

  @Test
  void testDiff21_10() {
    Diff21 d = new Diff21();
    assertEquals(11, d.diff21(10));
  }

  @Test
  void testDiff21_21() {
    Diff21 d = new Diff21();
    assertEquals(0, d.diff21(21));
  }

  @Test
  void testDiff21_22() {
    Diff21 d = new Diff21();
    assertEquals(2, d.diff21(22));
  }

  @Test
  void testDiff21_25() {
    Diff21 d = new Diff21();
    assertEquals(8, d.diff21(25));
  }

  @Test
  void testDiff21_30() {
    Diff21 d = new Diff21();
    assertEquals(18, d.diff21(30));
  }

  @Test
  void testDiff21_0() {
    Diff21 d = new Diff21();
    assertEquals(21, d.diff21(0));
  }

  @Test
  void testDiff21_1() {
    Diff21 d = new Diff21();
    assertEquals(20, d.diff21(1));
  }

  @Test
  void testDiff21_2() {
    Diff21 d = new Diff21();
    assertEquals(19, d.diff21(2));
  }

  @Test
  void testDiff21_minus1() {
    Diff21 d = new Diff21();
    assertEquals(22, d.diff21(-1));
  }

  @Test
  void testDiff21_minus2() {
    Diff21 d = new Diff21();
    assertEquals(23, d.diff21(-2));
  }

  @Test
  void testDiff21_50() {
    Diff21 d = new Diff21();
    assertEquals(58, d.diff21(50));
  }
}
