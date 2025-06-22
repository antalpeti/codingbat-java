package antalpeti.learn.codingbat_java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class CodingbatJavaApplicationTest {

  @Autowired
  private ApplicationContext context;

  @Test
  void contextLoads() {
    // The contextLoads test will pass if the Spring context loads successfully.
    assertTrue(true);
  }

  @Test
  void mainMethodRunsWithoutException() {
    assertDoesNotThrow(() -> CodingbatJavaApplication.main(new String[]{}));
  }

  @Test
  void applicationContextContainsMainBean() {
    assertTrue(context.containsBeanDefinition("codingbatJavaApplication"),
        "ApplicationContext should contain the CodingbatJavaApplication bean");
  }
}

