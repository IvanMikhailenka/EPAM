package task.dev1;

import task.dev1.printers.PrintValueToConsole;
import task.dev1.randomValuesSelectors.RandomValuesSelector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is the entry point of the program
 */
public class Main {
  private static final int NUMBER_OF_VALUES = 3;
  /**
   * Method starts execution of the program
   * @param args - input options witch need to filter and print result
   */
  public static void main(String[] args) {
    List<String> optionsList = new ArrayList<>(Arrays.asList(args));
    RandomValuesSelector optionsSelector = new RandomValuesSelector();
    PrintValueToConsole printer = new PrintValueToConsole();
    printer.printList(optionsSelector.select(optionsList, NUMBER_OF_VALUES));
  }
}
