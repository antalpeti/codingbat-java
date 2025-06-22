package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class SleepIn {

  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }
}
