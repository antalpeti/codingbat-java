package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class StartHi {
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
}

