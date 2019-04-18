package args03;

import static args03.Constant.Constants.COMMAND_SEPARATOR;
import static args03.Constant.Constants.SCHEMA_CONTENT;

public class Argument {
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
