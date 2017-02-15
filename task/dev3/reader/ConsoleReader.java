package task.dev3.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Provides method for input data from console
 */
public class ConsoleReader implements Reader {

  /**
   * Read data from console and return them
   * @return String - input data
   * @throws IOException - throws if there are problems with input
   */
  @Override
  public String read() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readString = reader.readLine();
    checkInputString(readString);
    return readString;
  }

  /**
   * Check that string was input
   * @param string - input data
   * @throws IOException - throws if data wasn't input
   */
  private void checkInputString(String string) throws IOException {
    if (string == null || string.equals(""))
      throw new IOException();
  }
}
