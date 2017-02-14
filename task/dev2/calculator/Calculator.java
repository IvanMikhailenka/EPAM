package task.dev2.calculator;

import task.dev2.calculator.rpnAlgorithm.RpnCalculatorAlgorithm;

import java.math.BigDecimal;

/**
 * Provides method for calculate arithmetic expression
 */
public class Calculator {

  /**
   * Calculate arithmetic expression and return result
   * @param expression - arithmetic expression as String
   * @return BigDecimal result - decision of arithmetic expression
   */
  public BigDecimal calc(String expression, int scale){
    RpnCalculatorAlgorithm algorithm = new RpnCalculatorAlgorithm();
    return algorithm.compute(expression.replaceAll(" ",""), scale);
  }
}
