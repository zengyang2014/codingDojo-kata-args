package args03;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class SchemaTest {
  @Test
  public void should_parse_a_schema_into_commands() {
    Schema schema = new Schema("l:boolean,d:string,p:int");

    assertEquals(Optional.of(new Command("l:boolean")), schema.getCommand("l"));
    assertEquals(Optional.of(new Command("d:string")), schema.getCommand("d"));
    assertEquals(Optional.of(new Command("p:int")), schema.getCommand("p"));
  }

 }
