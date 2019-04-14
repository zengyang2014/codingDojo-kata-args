class Argument {
  public static final String LOGGING_COMMAND = "-l";
  public static final String PORT_COMMAND = "-p";
  public static final int DEFAULT_PORT = 8080;
  private String command;

  public Argument(String command) {
    this.command = command;
  }

  public boolean parseLogging() {
    if (this.command.equals(LOGGING_COMMAND)) {
      return true;
    }
    return false;
  }

  public int parsePort() {
    if(this.command.split(" ")[0].equals(PORT_COMMAND))
      return Integer.valueOf(this.command.split(" ")[1]);

    return DEFAULT_PORT;
  }
}
