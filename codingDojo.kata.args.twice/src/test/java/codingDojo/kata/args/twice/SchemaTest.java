package codingDojo.kata.args.twice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SchemaTest {
  @Test
  public void should_resolve_schema_pattern() {
    Schema schema = new Schema("l:boolean,d:string,p:int");

    assertEquals("boolean", schema.getFlagByName("l").getValueType());
    assertEquals("string", schema.getFlagByName("d").getValueType());
    assertEquals("int", schema.getFlagByName("p").getValueType());
  }

}