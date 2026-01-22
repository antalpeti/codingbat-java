package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class LoneTeen {

    public boolean loneTeen(int a, int b) {
        return isTeen(a) != isTeen(b);
    }

    private boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }
}
