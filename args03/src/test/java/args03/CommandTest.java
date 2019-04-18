package args03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
  @Test
  public void should_initialize_a_logging_command() {
    Command command = new Command("l:boolean");

    assertEquals("l", command.getName());
    assertEquals("boolean", command.getValueType());
  }

  @Test
  public void should_initialize_a_port_command() {
    Command command = new Command("p:int");

    assertEquals("p", command.getName());
    assertEquals("int", command.getValueType());
  }

  @Test
  public void should_initialize_a_directory_command() {
    Command command = new Command("d:string");

    assertEquals("d", command.getName());
    assertEquals("string", command.getValueType());
  }
}
