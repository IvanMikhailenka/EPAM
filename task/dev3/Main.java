package task.dev3;

import task.dev3.view.UserConsoleView;

import java.io.IOException;

/**
 * This class is the entry point of the program
 */
public class Main {

  /**
   * Method starts execution of the program and call view class
   */
  public static void main(String... args) {
    UserConsoleView consoleView = new UserConsoleView();
    try {
      consoleView.showConsoleDialog();
    } catch (IOException e) {
      System.out.println("Sorry, program was stopped");
      //TODO: add stackTrace to log
    }
  }
}
