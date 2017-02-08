package task.dev1.validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides method for validate options according Bash syntax
 */
public class BashOptionValidator extends OptionValidator {
  private static final String SINGLE_OPTION_START_WITH = "-";
  private static final String LONG_OPTION_START_WITH = "--";
  private static final int COUNT_OF_SYMBOLS_IN_SINGLE_OPTION = 2;
  private static final int MIN_COUNT_OF_SYMBOLS_IN_LONG_OPTION = 4;

  /**
   * Validate optionList according Bash syntax for options
   * @param optionList - input options witch need to validate
   * @return List<Sting> - validated optionList
   */
  @Override
  public List<String> validate(List<String> optionList) {
    List<String> validatedOptionList = new ArrayList<>();
    for (String option : optionList) {
      if (option.startsWith(SINGLE_OPTION_START_WITH) &&
          option.length() == COUNT_OF_SYMBOLS_IN_SINGLE_OPTION) {
        validatedOptionList.add(option);
      }
      if (option.startsWith(LONG_OPTION_START_WITH) &&
          option.length() >= MIN_COUNT_OF_SYMBOLS_IN_LONG_OPTION) {
        validatedOptionList.add(option);
      }
    }
    return validatedOptionList;
  }
}
