package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class NearHundred {
  public boolean nearHundred(int n) {
    return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
  }
}

