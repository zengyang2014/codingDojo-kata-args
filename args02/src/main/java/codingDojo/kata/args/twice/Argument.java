package codingDojo.kata.args.twice;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Argument {
  public static final String SEPARATOR_SIGN = " ";

  private String key;
  private String value;
  private String valueType;

  public Argument(String command, Schema schema) {
    List<String> splitCommand = newArrayList(command.split(SEPARATOR_SIGN));
    this.key = splitCommand.get(0);
    this.valueType = schema.getFlagByName(this.key).getValueType();

    if(splitCommand.size() > 1) {
      this.value = splitCommand.get(1);
    }
  }

  public Object getValue() {
    switch (valueType) {
      case "boolean":
        return true;
      case "int":
        return Integer.valueOf(this.value);
      default:
        return this.value;

    }
  }

  public String getKey() {
    return this.key;
  }
}
