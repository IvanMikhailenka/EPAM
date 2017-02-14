package task.dev2.calculator.rpnAlgorithm;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Stack;

/**
 * Provides method for calculating input expression by Reverse Polish Notation algorithm
 * Supported operations : + , - , * , / , ( , )
 */
public class RpnCalculatorAlgorithm {
  private static final char PLUS = '+';
  private static final char MINUS = '-';
  private static final char MULTIPLICATION_SIGN = '*';
  private static final char DIVISION_SIGN = '/';
  private int scale;
  private MathSingChecker mathSingChecker = new MathSingChecker();
  private NegativeNumberReplacer numberReplacer = new NegativeNumberReplacer();
  private RpnConverter rpnConverter = new RpnConverter();

  /**
   * Compute input expression and return solution in given scale
   * @param expression - expression which need to compute
   * @param scale - number of numbers after the decimal point
   * @return BigDecimal - solution
   */
  public BigDecimal compute(String expression, int scale) {
    BigDecimal result = null;
    this.scale = scale;
    String replaceExpression = numberReplacer.replaceExpression(expression);
    String rpnExpression = rpnConverter.convertExpressionToRPN(replaceExpression);
    try {
      result = calculate(rpnExpression);
    } catch (Exception e) {
      // TODO: add message to log
      System.out.println(e.getMessage());
    }
    return result;
  }

  /**
   * Calculate RPN expression and return solution
   * @param rpnExpression - expression as RPN
   * @return BigDecimal - solution
   * @throws Exception - if expression was incorrect, e.g. contains letter or unsupported operation
   */
  private BigDecimal calculate(String rpnExpression) throws Exception {
    Stack<BigDecimal> resultStack = new Stack<>();
    String[] inputExpression = rpnExpression.split(" ");
    for (String token : inputExpression) {
      try {
        checkToken(resultStack, token);
      } catch (Exception e) {
        throw new ArithmeticException("Invalid expression");
      }
    }
    return resultStack.pop();
  }

  /**
   * Check token whether a number or math sing
   * @param decimals - contains intermediate values
   * @param token - current number or math sing
   */
  private void checkToken(Stack<BigDecimal> decimals, String token) {
    BigDecimal leftNumber, rightNumber, result;
    char firstSymbol = token.charAt(0);
    if (mathSingChecker.isMathSing(firstSymbol)) {
      rightNumber = new BigDecimal(String.valueOf(decimals.pop()));
      leftNumber = new BigDecimal(String.valueOf(decimals.pop()));
      result = makeOperationWithNumbers(leftNumber, rightNumber, firstSymbol);
      decimals.push(result);
    } else {
      leftNumber = new BigDecimal(token);
      decimals.push(leftNumber);
    }
  }

  /**
   * Calculate two numbers
   * @params leftNumber , rightNumber - numbers for the calculation
   * @param operation - math sing which need to execute
   * @return BigDecimal - solution
   * @throws ArithmeticException - if some operation doesn't execute
   */
  private BigDecimal makeOperationWithNumbers(BigDecimal leftNumber, BigDecimal rightNumber, char operation) {
    switch (operation) {
      case PLUS:
        return leftNumber.add(rightNumber, new MathContext(scale));
      case MINUS:
        return leftNumber.subtract(rightNumber, new MathContext(scale));
      case DIVISION_SIGN:
        return leftNumber.divide(rightNumber, scale, BigDecimal.ROUND_HALF_UP);
      case MULTIPLICATION_SIGN:
        return leftNumber.multiply(rightNumber, new MathContext(scale));
      default:
        throw new ArithmeticException("Unsupported operation " + operation);
    }
  }

  public int getScale() {
    return scale;
  }
}
