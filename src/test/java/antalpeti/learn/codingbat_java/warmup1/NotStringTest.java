package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NotStringTest {
  private final NotString notString = new NotString();

  @Test
  void testNotString_whenCandy() {
    assertEquals("not candy", notString.notString("candy"));
  }

  @Test
  void testNotString_whenX() {
    assertEquals("not x", notString.notString("x"));
  }

  @Test
  void testNotString_whenNotBad() {
    assertEquals("not bad", notString.notString("not bad"));
  }

  @Test
  void testNotString_whenBad() {
    assertEquals("not bad", notString.notString("bad"));
  }

  @Test
  void testNotString_whenNot() {
    assertEquals("not", notString.notString("not"));
  }

  @Test
  void testNotString_whenIsNot() {
    assertEquals("not is not", notString.notString("is not"));
  }

  @Test
  void testNotString_whenNo() {
    assertEquals("not no", notString.notString("no"));
  }
}

