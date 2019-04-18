package args03;

public class Argument {
  Command command;
  String value;

  public Argument(String text) {
    String[] splitText = text.split(" ");

    this.command = new Schema("l:boolean,d:string,p:int").getCommand(splitText[0]).get();

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
