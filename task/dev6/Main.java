package task.dev6;

import task.dev6.controller.ConsoleController;
import task.dev6.dateFormateReplacer.DateFormatReplacer;

/**
 * This class is the entry point of the program
 */
public class Main {

  /**
   * Method starts execution of the program and start console dialog
   */
  public static void main(String... args) throws InstantiationException, IllegalAccessException {
    ConsoleController controller = new ConsoleController();
    controller.startDialog();
  }
}