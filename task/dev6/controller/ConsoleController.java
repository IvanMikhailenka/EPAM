package task.dev6.controller;

import task.dev6.dateFormateReplacer.DateFormatReplacer;
import task.dev6.reader.ConsoleReader;
import task.dev6.view.ConsoleView;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides method to exchange information between console user and program
 */
public class ConsoleController {
  private static Logger logger = Logger.getAnonymousLogger();
  private static final String EXCEPTION_MESSAGE = "an exception was thrown";
  private Date currentDate = new Date();

  /**
   * Start dialog between user and program
   */
  public void startDialog() {
    ConsoleView consoleView = new ConsoleView(new ConsoleReader());
    DateFormatReplacer formatReplacer = new DateFormatReplacer();
    try {
      String dateFormatPattern = consoleView.inputDateFormat();
      String result = formatReplacer.replaceDateFormats(dateFormatPattern, currentDate);
      consoleView.printData(result);
    } catch (Exception exception) {
      logger.log(Level.SEVERE, EXCEPTION_MESSAGE, exception);
      startDialog();
    }
  }
}
