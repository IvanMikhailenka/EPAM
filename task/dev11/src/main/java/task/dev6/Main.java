package task.dev6;

import task.dev6.controller.ConsoleController;

/**
 * This class is the entry point of the program
 */
public class Main {

  /**
   * Method starts execution of the program and start console dialog
   */
  public static void main(String... args) {
    ConsoleController controller = new ConsoleController();
    controller.startDialog();
  }
}