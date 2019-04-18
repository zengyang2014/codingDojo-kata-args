package codingDojo.kata.args.twice;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArgumentTest {
  @Test
  public void should_resolve_key_and_value_when_given_command_is_logging_command() {
    Argument argument = new Argument("l", new Schema("l:boolean,d:string,p:int"));

    assertEquals(true ,argument.getValue());
    assertEquals("l", argument.getKey());
  }

  @Test
  public void should_resolve_key_and_value_when_given_command_is_port_command() {
    Argument argument = new Argument("p 8080", new Schema("l:boolean,d:string,p:int"));

    assertEquals(8080, argument.getValue());
    assertEquals("p", argument.getKey());
  }

  @Test
  public void should_resolve_key_and_value_when_given_command_is_directory_command() {
    Argument argument = new Argument("d /usr/logs", new Schema("l:boolean,d:string,p:int"));

    assertEquals("/usr/logs", argument.getValue());
    assertEquals("d", argument.getKey());
  }

}