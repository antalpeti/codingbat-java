package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class Front3 {
    public String front3(String str) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        return front + front + front;
    }
}
