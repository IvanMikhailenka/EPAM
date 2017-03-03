package task8.controller;

import task8.matrixMultiplication.MatrixMultiplication;
import task8.reader.ConsoleReader;
import task8.reader.Reader;
import task8.view.ConsoleView;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Provides method to exchange information between console user and program
 */
public class ConsoleController {
  private Reader reader;
  private ConsoleView view;
  private MatrixMultiplication multiplicator;

  /**
   * Start dialog between user and program
   */
  public void startDialog() throws IOException {
    reader = new ConsoleReader();
    view = new ConsoleView(reader);
    multiplicator = new MatrixMultiplication();
    BigDecimal[][] firstMatrix = view.inputMatrix(view.inputMatrixRowAmount(), view
        .inputMatrixColumnAmount());
    BigDecimal[][] secondMatrix = view.inputMatrix(view.inputMatrixRowAmount(), view
        .inputMatrixColumnAmount());
    view.printData(Arrays.deepToString(multiplicator.multiply(firstMatrix, secondMatrix)));
  }
}
