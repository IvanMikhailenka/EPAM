package task.dev2.calculator.rpnAlgorithm;

/**
 * Because every class of rpnAlgorithm contains methods which need to check math sing
 * it was decided to bring it in a separate class
 */
public class MathSingChecker {
  private static final char PLUS = '+';
  private static final char MINUS = '-';
  private static final char MULTIPLICATION_SIGN = '*';
  private static final char DIVISION_SIGN = '/';

  /**
   * Checks whether a character is math sing
   * @param sing - input sing
   * Returns true when character is math sing
   */
  public boolean isMathSing(Character sing) {
    switch (sing) {
      case MINUS:
      case PLUS:
      case MULTIPLICATION_SIGN:
      case DIVISION_SIGN:
        return true;
    }
    return false;
  }
}
