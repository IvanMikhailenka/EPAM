package task.dev1.validator;

import java.util.List;

/**
 * Super class for different kind of validators
 */
public abstract class OptionValidator {

  /**
   * Validate input optionList according with realization in child classes
   * @param optionList - input options witch need to validate
   * @return validated list
   */
  public abstract List<String> validate(List<String> optionList);
}
