package task.dev1;

import task.dev1.printers.PrintValueToConsole;
import task.dev1.randomValuesSelectors.RandomValuesSelector;
import task.dev1.validator.OptionValidator;
import task.dev1.validatorFactory.OptionValidatorFactory;
import task.dev1.validatorFactory.OptionValidatorFactoryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is the entry point of the program
 */
public class Main {
  private static final int NUMBER_OF_VALUES = 3;
  private static final String WINDOWS_PLATFORM = "windows";
  private static final String BASH_PLATFORM = "bash";

  /**
   * Method starts execution of the program
   * @param args - input options witch need to validate according platform,
   * then filter and print result
   */
  public static void main(String[] args) {
    List<String> optionsList = new ArrayList<>(Arrays.asList(args));
    OptionValidatorFactory optionValidatorFactory = new OptionValidatorFactoryImpl();
    OptionValidator optionValidator = optionValidatorFactory.getValidator(BASH_PLATFORM);
    RandomValuesSelector optionsSelector = new RandomValuesSelector();
    PrintValueToConsole printer = new PrintValueToConsole();
    printer.printList(optionsSelector.select(optionValidator.validate(optionsList), NUMBER_OF_VALUES));
  }
}
