package antalpeti.learn.codingbat_java.warmup1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MissingCharTest {

  private final MissingChar missingChar = new MissingChar();

  @Test
  void testMissingChar_kitten_1() {
    assertEquals("ktten", missingChar.missingChar("kitten", 1));
  }

  @Test
  void testMissingChar_kitten_0() {
    assertEquals("itten", missingChar.missingChar("kitten", 0));
  }

  @Test
  void testMissingChar_kitten_4() {
    assertEquals("kittn", missingChar.missingChar("kitten", 4));
  }

  @Test
  void testMissingChar_Hi_0() {
    assertEquals("i", missingChar.missingChar("Hi", 0));
  }

  @Test
  void testMissingChar_Hi_1() {
    assertEquals("H", missingChar.missingChar("Hi", 1));
  }

  @Test
  void testMissingChar_code_0() {
    assertEquals("ode", missingChar.missingChar("code", 0));
  }

  @Test
  void testMissingChar_code_1() {
    assertEquals("cde", missingChar.missingChar("code", 1));
  }

  @Test
  void testMissingChar_code_2() {
    assertEquals("coe", missingChar.missingChar("code", 2));
  }

  @Test
  void testMissingChar_code_3() {
    assertEquals("cod", missingChar.missingChar("code", 3));
  }

  @Test
  void testMissingChar_chocolate_8() {
    assertEquals("chocolat", missingChar.missingChar("chocolate", 8));
  }
}
