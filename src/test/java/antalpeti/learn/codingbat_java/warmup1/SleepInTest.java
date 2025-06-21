package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SleepInTest {
    @Autowired
    SleepIn sleepIn;

    @Test
    void testSleepIn_notWeekday_notVacation() {
        assertTrue(sleepIn.sleepIn(false, false));
    }

    @Test
    void testSleepIn_weekday_notVacation() {
        assertFalse(sleepIn.sleepIn(true, false));
    }

    @Test
    void testSleepIn_notWeekday_vacation() {
        assertTrue(sleepIn.sleepIn(false, true));
    }

    @Test
    void testSleepIn_weekday_vacation() {
        assertTrue(sleepIn.sleepIn(true, true));
    }
}
