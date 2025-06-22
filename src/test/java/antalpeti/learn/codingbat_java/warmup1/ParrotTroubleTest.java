package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParrotTroubleTest {
  @Autowired
  private ParrotTrouble parrotTrouble;

  @Test
  void testTalkingAt6() {
    assertTrue(parrotTrouble.parrotTrouble(true, 6));
  }

  @Test
  void testTalkingAt7() {
    assertFalse(parrotTrouble.parrotTrouble(true, 7));
  }

  @Test
  void testSilentAt6() {
    assertFalse(parrotTrouble.parrotTrouble(false, 6));
  }

  @Test
  void testTalkingAt21() {
    assertTrue(parrotTrouble.parrotTrouble(true, 21));
  }

  @Test
  void testSilentAt21() {
    assertFalse(parrotTrouble.parrotTrouble(false, 21));
  }

  @Test
  void testSilentAt20() {
    assertFalse(parrotTrouble.parrotTrouble(false, 20));
  }

  @Test
  void testTalkingAt23() {
    assertTrue(parrotTrouble.parrotTrouble(true, 23));
  }

  @Test
  void testSilentAt23() {
    assertFalse(parrotTrouble.parrotTrouble(false, 23));
  }

  @Test
  void testTalkingAt20() {
    assertFalse(parrotTrouble.parrotTrouble(true, 20));
  }

  @Test
  void testSilentAt12() {
    assertFalse(parrotTrouble.parrotTrouble(false, 12));
  }
}
