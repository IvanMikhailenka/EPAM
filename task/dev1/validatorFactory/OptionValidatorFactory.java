package task.dev1.validatorFactory;

import task.dev1.validator.OptionValidator;

/**
 * Super class with provides interface to method for creating OptionValidator
 */
public abstract class OptionValidatorFactory {
  private OptionValidator optionValidator;

  /**
   * Return optionValidator to input platform
   * @param platform - name of platform, for which we need to get validator
   */
  public OptionValidator getValidator(String platform) {
    optionValidator = createValidator(platform);
    return optionValidator;
  }

  /**
   * Factory method
   */
  abstract OptionValidator createValidator(String platform);
}
