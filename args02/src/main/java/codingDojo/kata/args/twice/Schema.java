package codingDojo.kata.args.twice;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Schema {
  private List<CommandFlag> commandFlags = newArrayList();

  public Schema(String text) {
    List<String> patterns = newArrayList(text.split(","));

    patterns.forEach(pattern -> {
      commandFlags.add(new CommandFlag(pattern));
    });
  }

  public CommandFlag getFlagByName(String flagName) {
    return commandFlags
        .stream()
        .filter(flag -> flag.getName().equals(flagName))
        .findFirst()
        .get();
  }
}
