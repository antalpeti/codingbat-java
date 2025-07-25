package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class FrontBack {
  public String frontBack(String str) {
    if (str.length() <= 1) {
      return str;
    }
    char first = str.charAt(0);
    char last = str.charAt(str.length() - 1);
    String middle = str.substring(1, str.length() - 1);
    return last + middle + first;
  }
}
