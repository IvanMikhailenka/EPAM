package task9;

import task9.controller.ConsoleController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is the entry point of the program
 */
public class Main {
  private static Logger logger = Logger.getAnonymousLogger();
  private static final String EXCEPTION_MESSAGE = "an exception was thrown";
  private static int NUMBER_OF_RETRIES = 10;

  /**
   * Method starts execution of the program and call controller class
   */
  public static void main(String... args) {
    String fileName = args[0];
    ConsoleController controller = new ConsoleController(fileName);
    for (int i = 0; i < NUMBER_OF_RETRIES; i++) {
      try {
        controller.startDialog();
        break;
      } catch (Exception exception) {
        logger.log(Level.SEVERE, EXCEPTION_MESSAGE, exception);
      }
    }
  }
}