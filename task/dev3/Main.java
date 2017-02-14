package task.dev3;

import task.dev3.controller.UserController;

import java.io.IOException;

/**
 * This class is the entry point of the program
 */
public class Main {

  /**
   * Method starts execution of the program and call controller class
   */
  public static void main(String... args) {
    UserController controller = new UserController();
    try {
      controller.showConsoleDialog();
    } catch (IOException e) {
      System.out.println("Sorry, program was stopped");
      //TODO: add stackTrace to log
    }
  }
}
