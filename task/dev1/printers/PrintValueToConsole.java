package task.dev1.printers;

import java.util.List;

/**
 * Print input value to console
 */
public class PrintValueToConsole {

  /**
   * Print list to console
   * @param valueList - input list witch need to print
   */
  public void printList(List valueList) {
    for (Object value : valueList) {
      System.out.println(value.toString());
    }
  }
}
