package task.dev4;

import task.dev4.view.ConsoleView;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is the entry point of the program
 */
public class Main {
  private static Logger logger = Logger.getAnonymousLogger();
  private static final String EXCEPTION_MESSAGE = "an exception was thrown";

  /**
   * Method starts execution of the program and start console dialog
   */
  public static void main(String... args) {
    ConsoleView view = new ConsoleView();
    try {
      view.consoleDialog();
    } catch (IOException ioException) {
      logger.log(Level.SEVERE, EXCEPTION_MESSAGE, ioException);
    }
  }
}