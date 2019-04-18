package args03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {
  @Test
  public void should_parse_input_into_three_commands_with_value() {
    InputParser parser = new InputParser("-l -p 8080 -d usr/logs");

    assertEquals(3, parser.parseArguments().size());
    assertEquals(true, parser.parseArguments().get(0).getValue());
    assertEquals(8080, parser.parseArguments().get(1).getValue());
    assertEquals("usr/logs", parser.parseArguments().get(2).getValue());
  }

}
