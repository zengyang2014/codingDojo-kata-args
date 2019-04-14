import org.junit.Test;

import static org.junit.Assert.*;

public class ArgumentTest {
  @Test
  public void should_parse_logging_character_as_true_when_there_is_logging_command() {
    Argument argument = new Argument("-l");

    assertTrue(argument.parseLogging());
  }

  @Test
  public void should_parse_logging_character_as_false_when_there_is_no_logging_command() {
    Argument argument = new Argument("");

    assertFalse(argument.parseLogging());
  }

  @Test
  public void should_parse_port_character_and_value_when_there_is_port_command() {
    Argument argument = new Argument("-p 10");
    Argument argumentOne = new Argument("-p 90");

    assertEquals(10, argument.parsePort());
    assertEquals(90, argumentOne.parsePort());
  }

  @Test
  public void should_parse_port_character_has_default_value_8080_when_there_is_no_port_command() {
    Argument argument = new Argument("");
    Argument argumentOne = new Argument("-l");

    assertEquals(8080, argument.parsePort());
    assertEquals(8080, argumentOne.parsePort());
  }

  @Test
  public void should_parse_logging_and_port_character_with_different_order() {
    Argument argument = new Argument("-l -p 90");
    Argument argumentOne = new Argument("-p 90 -l");

    assertEquals(90, argument.parsePort());
    assertTrue(argument.parseLogging());
    assertEquals(90, argumentOne.parsePort());
    assertTrue(argumentOne.parseLogging());
  }
}