package task.dev2;


import task.dev2.calculator.Calculator;
import task.dev2.converter.Converter;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * This class is the entry point of the program
 */
public class Main {

  /**
   * Method starts execution of the program and print result to console
   * @param args - one way to input arithmetic expression
   * @throws ScriptException - throws this if arithmetic expression is incorrect, e.g. contains word
   * @throws IOException - throws this when problem reading from the console
   */
  public static void main(String[] args) throws ScriptException, IOException {
    Calculator calculator = new Calculator();
    BigDecimal result;
    if (args.length == 0) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      result = calculator.calc(reader.readLine());
    } else {
      result = calculator.calc(new Converter().convertStringArrayToString(args));
    }
    System.out.println(result);
  }
}
