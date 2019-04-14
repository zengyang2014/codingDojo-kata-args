import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.google.common.collect.Lists.newArrayList;

class Argument {
  public static final String LOGGING_COMMAND = "l";
  public static final String PORT_COMMAND = "p";
  public static final String DIRECTORY_COMMAND = "d";

  public static final String SEPARATOR_SIGN = " ";
  public static final String COMMAND_PRECEDED_SIGN = "-";

  public static final String DEFAULT_DIRECTORY = "";
  public static final int DEFAULT_PORT = 8080;
  public static final boolean DEFAULT_LOGGING = false;

  private Map<String, String> arguments = new HashMap<>();

  public Argument(String command) {
    splitCommand(command);
  }

  public boolean parseLogging() {
    if (arguments.containsKey(LOGGING_COMMAND)) {
      return true;
    }
    return DEFAULT_LOGGING;
  }

  public int parsePort() {
    if (arguments.containsKey(PORT_COMMAND))
      return Integer.valueOf(arguments.get(PORT_COMMAND));

    return DEFAULT_PORT;
  }

  public String parseDirectory() {
    if (arguments.containsKey(DIRECTORY_COMMAND))
      return arguments.get(DIRECTORY_COMMAND);

    return DEFAULT_DIRECTORY;
  }

  private void splitCommand(String command) {
    ArrayList<String> commands = newArrayList(command.split(COMMAND_PRECEDED_SIGN));
    commands.remove(0);

    commands.forEach(cmd -> {
      ArrayList<String> splitCommand = newArrayList(cmd.split(SEPARATOR_SIGN));
      arguments.put(splitCommand.get(0), splitCommand.get(splitCommand.size() - 1));
    });
  }

}
