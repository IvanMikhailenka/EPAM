package task.dev2.calculator.rpnAlgorithm;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Provides method for replacing negative numbers in expression
 * in order to Reverse Polish Notation algorithm can work with them
 * For example: -5 + 2 replace to (0-5) + 2
 */
public class NegativeNumberReplacer {
  private static final char MINUS = '-';
  private static final char LEFT_BRACKET = '(';
  private static final char RIGHT_BRACKET = ')';
  private static final char ZERO = '0';
  private MathSingChecker mathSingChecker = new MathSingChecker();
  private List<Character> chars;

  /**
   * Replace negative numbers from input expression
   *
   * @param expression - input arithmetical expression
   * @return String - replaced expression
   */
  public String replaceExpression(String expression) {
    chars = expression.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
    FindNegativeNumber();
    StringBuilder sb = new StringBuilder(chars.size());
    for (char c : chars)
      sb.append(c);
    return sb.toString();
  }

  /**
   * Parse expression and finds negative numbers
   */
  private void FindNegativeNumber() {
    int iterator;
    iterator = checkFirstNumber();
    for (; iterator < chars.size(); iterator++) {
      if ((mathSingChecker.isMathSing(chars.get(iterator)) || chars.get(iterator)==LEFT_BRACKET)
          && chars.get(iterator + 1) == MINUS) {
        iterator = setLeftBracketOnNegativeNumber(iterator);
        iterator = setRightBracketOnNegativeNumber(iterator);
      }
    }
  }

  /**
   * If first number is negative, replace it.
   * For example: -5 convert to (0-5)
   * @return int - iterator for continue parsing
   */
  private int checkFirstNumber() {
    int iterator = 0;
    int startElement = 0;
    if (chars.get(startElement) == MINUS) {
      chars.add(startElement, LEFT_BRACKET);
      chars.add(startElement + 1, ZERO);
      iterator = startElement + 2;
      iterator = setRightBracketOnNegativeNumber(iterator);
    }
    return iterator;
  }

  /**
   * Replace '-' on negative number to '(0 -'
   * @param iterator - number of negative value
   * @return int - number of negative value after replace
   */
  private int setLeftBracketOnNegativeNumber(int iterator) {
    chars.add(iterator + 1, LEFT_BRACKET);
    chars.add(iterator + 2, ZERO);
    iterator += 4;
    return iterator;
  }

  /**
   * Find end of negative value and close bracket
   * @param iterator - number of negative value
   * @return int - end of negative value
   */
  private int setRightBracketOnNegativeNumber(int iterator) {
    int lastElement = chars.size() - 1;
    for (; iterator < chars.size(); iterator++) {
      if (mathSingChecker.isMathSing(chars.get(iterator))) {
        chars.add(iterator, RIGHT_BRACKET);
        break;
      } else if (iterator == lastElement) {
        chars.add(RIGHT_BRACKET);
        break;
      }
    }
    return iterator;
  }

}
