package task9.view;

import task9.reader.Reader;

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
   * Ask user to enter section
   * @return String - input section
   * @throws IOException - throws if problems with input data
   */
  public String inputSection() throws IOException {
    System.out.println("Please input section");
    return reader.read();
  }

  /**
   * Ask user to enter key
   * @return String - input key
   * @throws IOException - throws if problems with input data
   */
  public String inputKey() throws IOException {
    System.out.println("Please input key");
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
