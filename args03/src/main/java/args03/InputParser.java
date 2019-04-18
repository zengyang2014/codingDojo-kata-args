package args03;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class InputParser {
  List<Argument> arguments = newArrayList();

  public InputParser(String text) {
    List<String> splitTexts = newArrayList(text.split("-"));
    splitTexts.remove(0);

    splitTexts.stream().forEach(splitText -> this.arguments.add(new Argument(splitText)));
  }

  public List<Argument> parseArguments() {
    return this.arguments;
  }
}
