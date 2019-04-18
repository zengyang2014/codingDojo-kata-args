package args03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArgumentTest {
  @Test
  public void should_parse_logging_command_and_value() {
    Argument argument = new Argument("l");

    assertTrue((Boolean) argument.getValue());
  }

  @Test
  public void should_parse_port_command_and_value() {
    Argument argument = new Argument("p 8080");

    assertEquals(8080, argument.getValue());
  }

  @Test
  public void should_parse_directory_command_and_value() {
    Argument argument = new Argument("d /usr/logs");

    assertEquals("/usr/logs", argument.getValue());
  }
}
