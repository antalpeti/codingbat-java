package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class MonkeyTrouble {
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile == bSmile;
  }
}
