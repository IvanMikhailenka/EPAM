package task8.view;

import task8.reader.Reader;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Provides method for conducting a dialogue with user
 */
public class ConsoleView {
  private Reader reader;

  public ConsoleView(Reader reader) {
    this.reader = reader;
  }

  /**
   * Ask user to enter matrix row amount
   * @return int - matrix row amount
   * @throws IOException - throws if problems with input data
   */
  public int inputMatrixRowAmount() throws IOException {
    System.out.println("Please input matrix row amount");
    return Integer.parseInt(reader.read());
  }

  /**
   * Ask user to enter matrix column amount
   * @return int - matrix column amount
   * @throws IOException - throws if problems with input data
   */
  public int inputMatrixColumnAmount() throws IOException {
    System.out.println("Please input matrix column amount");
    return Integer.parseInt(reader.read());
  }

  /**
   * Ask user to fill matrix by values
   * @param row - matrix row amount
   * @param column - matrix column amount
   * @return BigDecimal[][] - filled matrix
   * @throws IOException - throws if problems with input data
   */
  public BigDecimal[][] inputMatrix(int row, int column) throws IOException {
    System.out.println("Please input matrix");
    BigDecimal[][] inputMatrix = new BigDecimal[row][column];
    for (int i = 0; i < inputMatrix.length; i++) {
      for (int j = 0; j < inputMatrix[0].length; j++) {
        System.out.println("input [" + i + "][" + j + "]");
        inputMatrix[i][j] = new BigDecimal(reader.read());
      }
    }
    return inputMatrix;
  }

  /**
   * Print date to console
   * @param data - input data
   */
  public void printData(String data) {
    System.out.println(data);
  }
}
