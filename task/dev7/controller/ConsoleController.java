package task.dev7.controller;

import task.dev7.dateFormatChecker.DateFormatChecker;
import task.dev7.dateFormatChecker.SpecificDateDateFormatChecker;
import task.dev7.reader.ConsoleReader;
import task.dev7.reader.Reader;
import task.dev7.view.ConsoleView;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Provides method to exchange information between console user and program
 */
public class ConsoleController {
  private static final List FORM_LIST = Arrays.asList("yyyy", "MM", "dddd");
  private static final Character DELIMITER = ':';
  private Reader reader;
  private DateFormatChecker checker;

  /**
   * Start dialog between user and program
   */
  public void startDialog() throws IOException {
    reader = new ConsoleReader();
    checker = new SpecificDateDateFormatChecker(FORM_LIST, DELIMITER);
    ConsoleView view = new ConsoleView(reader);
    view.showValidDatePattern();
    view.printData(String.valueOf(checker.checkDateFormat(view.inputDateFormat())));
  }
}
