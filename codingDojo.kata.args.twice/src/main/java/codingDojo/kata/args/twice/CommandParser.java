package codingDojo.kata.args.twice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

public class CommandParser {
  public static final String COMMAND_PRECEDED_SIGN = "-";
  private ArrayList<String> commands;

  public CommandParser(String inputText) {
    commands = newArrayList(inputText.split(COMMAND_PRECEDED_SIGN));
    commands.remove(0);
  }

  public List<Argument> getArguments() {
    return commands.stream().map(command -> {
      return new Argument(command);
    }).collect(Collectors.toList());
  }
}
