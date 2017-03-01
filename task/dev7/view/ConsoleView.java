package task.dev7.view;


import task.dev7.reader.Reader;

import java.io.IOException;

/**
 * Provides method for conducting a dialogue with user
 */
public class ConsoleView {
  private Reader reader;

  public ConsoleView(Reader reader) {
    this.reader = reader;
  }


  /**
   * Print to console valid date form pattern
   */
  public void showValidDatePattern() {
    System.out.println("Valid date form: yyyy:MM:dddd");
  }

  /**
   * Asks user to enter a date
   * @return String - input date
   * @throws IOException - throws if problems with input data
   */
  public String inputDateFormat() throws IOException {
    System.out.println("Please input date for check");
    return reader.read();
  }

  /**
   * Print date to console
   * @param data - input data
   */
  public void printData(String data) {
    System.out.println(data);
  }
}
