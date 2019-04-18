package args03;

import java.util.List;
import java.util.Optional;

import static args03.Constant.Constants.SCHEMA_PATTERN_SEPARATOR;
import static com.google.common.collect.Lists.newArrayList;

public class Schema {
  private List<Command> commands = newArrayList();

  public Schema(String text) {
    List<String> stringCommands = newArrayList(text.split(SCHEMA_PATTERN_SEPARATOR));

    stringCommands.forEach(stringCommand -> this.commands.add(new Command(stringCommand)));
  }

  public Optional<Command> getCommand(String commandName) {
    return this.commands.stream().filter(command -> command.getName().equals(commandName)).findAny();
  }
}
