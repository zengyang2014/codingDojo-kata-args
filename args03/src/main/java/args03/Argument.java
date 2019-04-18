package args03;

public class Argument {
  public static final String COMMAND_SEPARATOR = " ";
  public static final String SCHEMA_CONTENT = "l:boolean,d:string,p:int";


  Command command;
  String value;

  public Argument(String text) {
    String[] splitText = text.split(COMMAND_SEPARATOR);

    this.command = new Schema(SCHEMA_CONTENT).getCommand(splitText[0]).get();

    if(splitText.length > 1)
      this.value = splitText[1];
  }

  public Object getValue() {
    switch (this.command.getValueType()) {
      case "boolean":
        return true;
      case "int":
        return Integer.valueOf(this.value);
      default:
        return this.value;
    }
  }
}
