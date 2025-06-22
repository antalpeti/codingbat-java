package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class NotString {

  public String notString(String str) {
    if (str.startsWith("not")) {
      return str;
    }
    return "not " + str;
  }
}

