package task9.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 * Provides method for input data from file
 */
public class FileReader implements Reader {
  private String fileName;

  public FileReader(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Read data from file
   * @return String - read file as String
   * @throws IOException - throws if there are problems with read data
   */
  @Override
  public String read() throws IOException {
    StringBuilder fileAsString = new StringBuilder();
    try (BufferedReader in = new BufferedReader(new java.io.FileReader(new File(fileName)))) {
      String line;
      while ((line = in.readLine()) != null) {
        fileAsString.append(line);
        fileAsString.append("\n");
      }
    }
    return fileAsString.toString();
  }
}
