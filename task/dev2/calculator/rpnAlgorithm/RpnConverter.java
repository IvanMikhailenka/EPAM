package task.dev2.calculator.rpnAlgorithm;

import java.util.Stack;

/**
 * Provides method for convert input expression to Reverse Polish Notation
 * For example: 1+2*3 convert to 1 2 3 * +
 */
public class RpnConverter {
  private static final char PLUS = '+';
  private static final char MINUS = '-';
  private static final char LEFT_BRACKET = '(';
  private static final char RIGHT_BRACKET = ')';
  private static final char GAP = ' ';
  private MathSingChecker mathSingChecker = new MathSingChecker();
  private Stack<Character> operationStack;
  private StringBuilder result;

  /**
   * Convert input expression to RPN
   * @param expression: input arithmetical expression
   * @return: The Reverse Polish notation of this expression
   */
  public String convertExpressionToRPN(String expression) {
    result = new StringBuilder();
    if (expression == null) {
      return result.toString();
    }
    operationStack = new Stack<>();
    for (Character token : expression.toCharArray()) {
      checkToken(token);
    }
    setOperations();
    return result.toString();
  }

  /**
   * Check token whether a bracket, mathSing or else
   * @param token - current value
   */
  private void checkToken(Character token) {
    if (token == LEFT_BRACKET) {
      operationStack.push(token);
    } else if (token == RIGHT_BRACKET) {
      setOperationInBrackets();
    } else if (mathSingChecker.isMathSing(token)) {
      sortOperationByPriority(token);
    } else {
      result.append(token);
    }
  }

  /**
   * Set to result RPN math sing which was in brackets
   */
  private void setOperationInBrackets() {
    while (!(operationStack.peek() == LEFT_BRACKET)) {
      result.append(GAP);
      result.append(operationStack.pop());
    }
    operationStack.pop();
  }

  private void sortOperationByPriority(Character token) {
    while (!operationStack.isEmpty() && getPriority(operationStack.peek()) <= getPriority(token)) {
      result.append(GAP);
      result.append(operationStack.pop());
    }
    operationStack.push(token);
    result.append(GAP);
  }

  /**
   * Set sorted operation to result RPN
   */
  private void setOperations() {
    while (!operationStack.isEmpty()) {
      result.append(GAP);
      result.append(operationStack.pop());
    }
  }

  private int getPriority(Character operator) {
    switch (operator) {
      case LEFT_BRACKET:
        return 2;
      case PLUS:
      case MINUS:
        return 1;
    }
    return 0;
  }
}
