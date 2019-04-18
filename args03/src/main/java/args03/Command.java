package args03;

public class Command {
  private String name;
  private String valueType;

  public Command(String text) {
    String[] splitText = text.split(":");

    this.name = splitText[0];
    this.valueType = splitText[1];
  }

  public String getName() {
    return this.name;
  }

  public String getValueType() {
    return this.valueType;
  }
}
