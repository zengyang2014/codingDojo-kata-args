package codingDojo.kata.args.twice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandParserTest {
  @Test
  public void should_parse_input_to_three_arguments() {
    CommandParser commandParser = new CommandParser("-l -p 8080 -d /usr/logs");

    assertEquals(commandParser.getArguments().size(), 3);
  }

  @Test
  public void should_parse_input_to_two_commands() {
    CommandParser commandParser = new CommandParser("-p 8080 -d /usr/logs");

    assertEquals(commandParser.getArguments().size(), 2);
  }
}
