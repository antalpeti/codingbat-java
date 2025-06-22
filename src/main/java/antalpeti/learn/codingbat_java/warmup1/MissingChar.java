package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class MissingChar {

  public String missingChar(String str, int n) {
    return str.substring(0, n) + str.substring(n + 1);
  }
}

