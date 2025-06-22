package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PosNegTest {
  @Autowired
  private PosNeg posNeg;

  @Test void testPosNeg_when1Minus1False() { assertTrue(posNeg.posNeg(1, -1, false)); }
  @Test void testPosNeg_whenMinus11False() { assertTrue(posNeg.posNeg(-1, 1, false)); }
  @Test void testPosNeg_whenMinus4Minus5True() { assertTrue(posNeg.posNeg(-4, -5, true)); }
  @Test void testPosNeg_whenMinus4Minus5False() { assertFalse(posNeg.posNeg(-4, -5, false)); }
  @Test void testPosNeg_whenMinus4_5False() { assertTrue(posNeg.posNeg(-4, 5, false)); }
  @Test void testPosNeg_whenMinus4_5True() { assertFalse(posNeg.posNeg(-4, 5, true)); }
  @Test void testPosNeg_when1_1False() { assertFalse(posNeg.posNeg(1, 1, false)); }
  @Test void testPosNeg_whenMinus1Minus1False() { assertFalse(posNeg.posNeg(-1, -1, false)); }
  @Test void testPosNeg_when1Minus1True() { assertFalse(posNeg.posNeg(1, -1, true)); }
  @Test void testPosNeg_whenMinus11True() { assertFalse(posNeg.posNeg(-1, 1, true)); }
  @Test void testPosNeg_when1_1True() { assertFalse(posNeg.posNeg(1, 1, true)); }
  @Test void testPosNeg_whenMinus1Minus1True() { assertTrue(posNeg.posNeg(-1, -1, true)); }
  @Test void testPosNeg_when5Minus5False() { assertTrue(posNeg.posNeg(5, -5, false)); }
  @Test void testPosNeg_whenMinus66False() { assertTrue(posNeg.posNeg(-6, 6, false)); }
  @Test void testPosNeg_whenMinus5Minus6False() { assertFalse(posNeg.posNeg(-5, -6, false)); }
  @Test void testPosNeg_whenMinus2Minus1False() { assertFalse(posNeg.posNeg(-2, -1, false)); }
  @Test void testPosNeg_when1_2False() { assertFalse(posNeg.posNeg(1, 2, false)); }
  @Test void testPosNeg_whenMinus56True() { assertFalse(posNeg.posNeg(-5, 6, true)); }
  @Test void testPosNeg_whenMinus5Minus5True() { assertTrue(posNeg.posNeg(-5, -5, true)); }
}

