package antalpeti.learn.codingbat_java.warmup1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FrontBackTest {

  @Autowired
  FrontBack frontBack;

  @Test
  void testFrontBack_code() {
    assertEquals("eodc", frontBack.frontBack("code"));
  }

  @Test
  void testFrontBack_a() {
    assertEquals("a", frontBack.frontBack("a"));
  }

  @Test
  void testFrontBack_ab() {
    assertEquals("ba", frontBack.frontBack("ab"));
  }

  @Test
  void testFrontBack_abc() {
    assertEquals("cba", frontBack.frontBack("abc"));
  }

  @Test
  void testFrontBack_empty() {
    assertEquals("", frontBack.frontBack(""));
  }

  @Test
  void testFrontBack_Chocolate() {
    assertEquals("ehocolatC", frontBack.frontBack("Chocolate"));
  }

  @Test
  void testFrontBack_aavJ() {
    assertEquals("Java", frontBack.frontBack("aavJ"));
  }

  @Test
  void testFrontBack_hello() {
    assertEquals("oellh", frontBack.frontBack("hello"));
  }
}
