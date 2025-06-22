package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NearHundredTest {
  @Autowired
  private NearHundred nearHundred;

  @Test void testNearHundred_whenInputIs93() { assertTrue(nearHundred.nearHundred(93)); }
  @Test void testNearHundred_whenInputIs90() { assertTrue(nearHundred.nearHundred(90)); }
  @Test void testNearHundred_whenInputIs89() { assertFalse(nearHundred.nearHundred(89)); }
  @Test void testNearHundred_whenInputIs110() { assertTrue(nearHundred.nearHundred(110)); }
  @Test void testNearHundred_whenInputIs111() { assertFalse(nearHundred.nearHundred(111)); }
  @Test void testNearHundred_whenInputIs121() { assertFalse(nearHundred.nearHundred(121)); }
  @Test void testNearHundred_whenInputIsMinus101() { assertFalse(nearHundred.nearHundred(-101)); }
  @Test void testNearHundred_whenInputIsMinus209() { assertFalse(nearHundred.nearHundred(-209)); }
  @Test void testNearHundred_whenInputIs190() { assertTrue(nearHundred.nearHundred(190)); }
  @Test void testNearHundred_whenInputIs209() { assertTrue(nearHundred.nearHundred(209)); }
  @Test void testNearHundred_whenInputIs0() { assertFalse(nearHundred.nearHundred(0)); }
  @Test void testNearHundred_whenInputIs5() { assertFalse(nearHundred.nearHundred(5)); }
  @Test void testNearHundred_whenInputIsMinus50() { assertFalse(nearHundred.nearHundred(-50)); }
  @Test void testNearHundred_whenInputIs191() { assertTrue(nearHundred.nearHundred(191)); }
  @Test void testNearHundred_whenInputIs189() { assertFalse(nearHundred.nearHundred(189)); }
  @Test void testNearHundred_whenInputIs200() { assertTrue(nearHundred.nearHundred(200)); }
  @Test void testNearHundred_whenInputIs210() { assertTrue(nearHundred.nearHundred(210)); }
  @Test void testNearHundred_whenInputIs211() { assertFalse(nearHundred.nearHundred(211)); }
  @Test void testNearHundred_whenInputIs290() { assertFalse(nearHundred.nearHundred(290)); }
}
