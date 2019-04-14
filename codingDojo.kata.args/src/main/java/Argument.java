import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.google.common.collect.Lists.newArrayList;

class Argument {
  public static final String LOGGING_COMMAND = "l";
  public static final String PORT_COMMAND = "p";
  public static final int DEFAULT_PORT = 8080;
  public static final String MINUS = "-";
  public static final String SPACE = " ";

  private Map<String, String> arguments = new HashMap<>();

  public Argument(String command) {
    splitCommand(command);
  }

  public boolean parseLogging() {
    if (arguments.containsKey(LOGGING_COMMAND)) {
      return true;
    }
    return false;
  }

  public int parsePort() {
    if (arguments.containsKey(PORT_COMMAND))
      return Integer.valueOf(arguments.get(PORT_COMMAND));

    return DEFAULT_PORT;
  }

  private void splitCommand(String command) {
    ArrayList<String> commands = newArrayList(command.split(MINUS));
    commands.remove(0);

    commands.forEach(cmd -> {
      ArrayList<String> splitCommand = newArrayList(cmd.split(SPACE));
      arguments.put(splitCommand.get(0), splitCommand.get(splitCommand.size() - 1));
    });
  }

}
