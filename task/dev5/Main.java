package task.dev5;

import task.dev5.controller.ConsoleController;

/**
 * This class is the entry point of the program
 */
public class Main {

  /**
   * Method starts execution of the program and call controller class
   */
  public static void main(String... args) {
    ConsoleController controller = new ConsoleController();
    controller.smartDialog();
  }
}
