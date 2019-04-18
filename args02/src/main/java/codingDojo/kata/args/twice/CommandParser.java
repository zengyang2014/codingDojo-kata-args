package codingDojo.kata.args.twice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

public class CommandParser {
  public static final String COMMAND_PRECEDED_SIGN = "-";
  public static final String SCHEMA_PATTERN = "l:boolean,d:string,p:int";

  private ArrayList<String> commands;

  public CommandParser(String inputText) {
    commands = newArrayList(inputText.split(COMMAND_PRECEDED_SIGN));
    commands.remove(0);
  }

  public List<Argument> getArguments() {
    return commands.stream()
        .map((command) -> new Argument(command, new Schema(SCHEMA_PATTERN)))
        .collect(Collectors.toList());
  }
}
