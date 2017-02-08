package task.dev1.validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides method for validate options according Windows syntax
 */
public class WindowsOptionValidator extends OptionValidator {
  private static final String OPTION_START_WITH = "/";

  /**
   * Validate optionList according Windows syntax for options
   * @param optionList - input options witch need to validate
   * @return List<Sting> - validated optionList
   */
  @Override
  public List<String> validate(List<String> optionList) {
    List<String> validatedOptionList = new ArrayList<>();
    for (String option : optionList) {
      if (option.startsWith(OPTION_START_WITH))
        validatedOptionList.add(option);
    }
    return validatedOptionList;
  }
}
