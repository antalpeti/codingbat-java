package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class ParrotTrouble {

  public boolean parrotTrouble(boolean talking, int hour) {
    return talking && (hour < 7 || hour > 20);
  }
}

