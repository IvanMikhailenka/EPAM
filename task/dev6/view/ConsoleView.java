package task.dev6.view;

import task.dev6.reader.Reader;

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
   * Asks user to enter a date format parser
   * @return String - input date format parser
   * @throws IOException - throws if problems with input data
   */
  public String inputDateFormat() throws IOException {
    System.out.println("Please input date format pattern");
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
