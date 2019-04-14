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
  public void should_parse_port_command_and_value_when_there_is_port_command() {
    Argument argument = new Argument("-p 10");
    Argument argumentOne = new Argument("-p 90");

    assertEquals(argument.parsePort(), 10);
    assertEquals(argumentOne.parsePort(), 90);
  }

  @Test
  public void should_parse_port_command_has_default_value_8080_when_there_is_no_port_command() {
    Argument argument = new Argument("");
    Argument argumentOne = new Argument("-l");

    assertEquals(argument.parsePort(), 8080);
    assertEquals(argumentOne.parsePort(), 8080);
  }
}