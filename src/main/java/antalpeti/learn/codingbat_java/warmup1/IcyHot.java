package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }
}

