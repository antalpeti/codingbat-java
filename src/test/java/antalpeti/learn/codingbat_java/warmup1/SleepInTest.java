package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SleepInTest {
  @Test
  void testSleepIn_notWeekday_notVacation() {
    SleepIn si = new SleepIn();
    assertTrue(si.sleepIn(false, false));
  }

  @Test
  void testSleepIn_weekday_notVacation() {
    SleepIn si = new SleepIn();
    assertFalse(si.sleepIn(true, false));
  }

  @Test
  void testSleepIn_notWeekday_vacation() {
    SleepIn si = new SleepIn();
    assertTrue(si.sleepIn(false, true));
  }

  @Test
  void testSleepIn_weekday_vacation() {
    SleepIn si = new SleepIn();
    assertTrue(si.sleepIn(true, true));
  }
}

