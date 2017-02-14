package task.dev3.reader;

import java.io.IOException;

/**
 * Determines behavior for different Readers
 */
public interface Reader {

  /**
   * Returns input string
   * @throws IOException - throws if there are problems
   */
  String read() throws IOException;
}