package args03;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InputParserTest {
  @Test
  public void should_parse_input_into_three_commands_with_value() {
    List<Argument> arguments = InputParser.parseArguments("-l -p 8080 -d usr/logs");

    assertEquals(3, arguments.size());
    assertEquals(true, arguments.get(0).getValue());
    assertEquals(8080, arguments.get(1).getValue());
    assertEquals("usr/logs", arguments.get(2).getValue());
  }

}
