package codingDojo.kata.args.twice;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandFlagTest {
  @Test
  public void should_resolve_flag_and_value_type() {
    CommandFlag commandFlag = new CommandFlag("l:boolean");

    assertEquals("boolean", commandFlag.getValueType());
  }

}