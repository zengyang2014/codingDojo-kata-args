package args03;

import java.util.List;
import java.util.Optional;

import static com.google.common.collect.Lists.newArrayList;

public class Schema {
  public static final String SCHEMA_PATTERN_SEPARATOR = ",";

  private List<Command> commands = newArrayList();

  public Schema(String text) {
    List<String> stringCommands = newArrayList(text.split(SCHEMA_PATTERN_SEPARATOR));

    stringCommands.forEach(stringCommand -> this.commands.add(new Command(stringCommand)));
  }

  public Optional<Command> getCommand(String commandName) {
    return this.commands.stream().filter(command -> command.getName().equals(commandName)).findAny();
  }
}
