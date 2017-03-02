package task9.controller;

import task9.fileStringParser.ConfigStringParser;
import task9.reader.ConsoleReader;
import task9.reader.FileReader;
import task9.reader.Reader;
import task9.view.ConsoleView;

import java.io.IOException;

/**
 * Provides method to exchange information between console user and program
 */
public class ConsoleController {
  private String fileName;
  private Reader reader;
  private ConsoleView view;

  public ConsoleController(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Start dialog between user and program
   */
  public void startDialog() throws IOException {
    reader = new ConsoleReader();
    view = new ConsoleView(reader);
    ConfigStringParser parser = new ConfigStringParser();
    view.printData(parser.getValue(new FileReader(fileName).read(), view.inputSection(),
        view.inputKey()));
  }
}
