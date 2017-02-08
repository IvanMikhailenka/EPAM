package task.dev1.printers;

import java.util.List;

/**
 * Print input value to console
 */
public class PrintValueToConsole {

  /**
   * Print object to console
   * @param value - input object witch need to print
   */
  public void printObject(Object value) {
    if (value != null) {
      System.out.println(value.toString());
    }
  }

  /**
   * Print list to console
   * @param valueList - input list witch need to print
   */
  public void printList(List valueList) {
    if (valueList != null) {
      for (Object value : valueList) {
        printObject(value);
      }
    }
  }
}
