package codingDojo.kata.args.twice;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class CommandFlag {
  private String name;
  private String valueType;

  public CommandFlag(String pattern) {
    List<String> splitPattern = newArrayList(pattern.split(":"));

    this.name = splitPattern.get(0);
    this.valueType = splitPattern.get(1);
  }

  public String getValueType() {
    return this.valueType;
  }

  public String getName() {
    return this.name;
  }
}
