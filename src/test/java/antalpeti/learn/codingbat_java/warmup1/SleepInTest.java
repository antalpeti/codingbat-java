package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SleepInTest {
    @Autowired
    SleepIn sleepIn;

    @Test
    void testSleepIn_whenNotWeekdayAndNotVacation() {
        assertTrue(sleepIn.sleepIn(false, false));
    }

    @Test
    void testSleepIn_whenWeekdayAndNotVacation() {
        assertFalse(sleepIn.sleepIn(true, false));
    }

    @Test
    void testSleepIn_whenNotWeekdayAndVacation() {
        assertTrue(sleepIn.sleepIn(false, true));
    }

    @Test
    void testSleepIn_whenWeekdayAndVacation() {
        assertTrue(sleepIn.sleepIn(true, true));
    }
}
