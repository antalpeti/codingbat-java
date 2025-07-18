package antalpeti.learn.codingbat_java.warmup1;

import org.springframework.stereotype.Component;

@Component
public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }
}

