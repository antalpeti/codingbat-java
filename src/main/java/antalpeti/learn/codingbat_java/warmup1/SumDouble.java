package antalpeti.learn.codingbat_java.warmup1;

public class SumDouble {
  public int sumDouble(int a, int b) {
    int sum = a + b;
    if (a == b) {
      return 2 * sum;
    }
    return sum;
  }
}
