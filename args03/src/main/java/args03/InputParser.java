package args03;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

class InputParser {

  public static List<Argument> parseArguments(String inputText) {
    List<Argument> arguments = newArrayList();
    List<String> splitTexts = newArrayList(inputText.split("-"));
    splitTexts.remove(0);

    splitTexts.stream().forEach(splitText -> arguments.add(new Argument(splitText)));
    return arguments;
  }
}
