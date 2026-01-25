package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class Diff21 {

  public int diff21(int n) {
    return n <= 21 ? 21 - n : (n - 21) * 2;
  }

}
