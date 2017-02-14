package task.dev2;

import task.dev2.calculator.Calculator;
import task.dev2.combiner.Combiner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


/**
 * This class is the entry point of the program
 */
public class Main {
  private static final int SCALE = 20;

  /**
   * Method starts execution of the program and print result to console
   * @param args - one way to input arithmetic expression
   */
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    BigDecimal result = null;
    if (args.length == 0) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try {
        result = calculator.calc(reader.readLine(), SCALE);
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      result = calculator.calc(new Combiner().combineStringArrayToString(args), SCALE);
    }
    System.out.println(result);
  }
}
