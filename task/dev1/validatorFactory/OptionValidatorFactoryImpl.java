package task.dev1.validatorFactory;

import task.dev1.validator.BashOptionValidator;
import task.dev1.validator.OptionValidator;
import task.dev1.validator.WindowsOptionValidator;

/**
 * Factory. Responsible for creating OptionValidators
 */
public class OptionValidatorFactoryImpl extends OptionValidatorFactory {
  private static final String WINDOWS_PLATFORM = "windows";
  private static final String BASH_PLATFORM = "bash";

  /**
   * Creates and return optionValidator according input platform
   * @param platform - name of platform, for which we need to create validator
   * Returns OptionValidator if input platform exist
   */
  @Override
  OptionValidator createValidator(String platform) {
    if (platform.equalsIgnoreCase(WINDOWS_PLATFORM))
      return new WindowsOptionValidator();
    if (platform.equalsIgnoreCase(BASH_PLATFORM))
      return new BashOptionValidator();
    else
      return null;
  }
}
