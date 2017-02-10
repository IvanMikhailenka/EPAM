package task.dev2.calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

/**
 * Provides method for calculate arithmetic expression
 */
public class Calculator {
  private static final String SCRIPT_ENGINE = "JavaScript";

  /**
   * Calculate arithmetic expression and return result
   * @param expression - arithmetic expression as String
   * @return BigDecimal result - decision of arithmetic expression
   * @throws ScriptException - throws this if arithmetic expression is incorrect, e.g. contains word
   */
  public BigDecimal calc(String expression) throws ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName(SCRIPT_ENGINE);
    return new BigDecimal(engine.eval(expression).toString());
  }
}
