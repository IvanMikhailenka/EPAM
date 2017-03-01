package task.dev5.reader;

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
    return reader.readLine();
  }
}