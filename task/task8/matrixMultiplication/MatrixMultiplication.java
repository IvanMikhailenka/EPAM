package task8.matrixMultiplication;

import java.math.BigDecimal;

/**
 * Provides method for multiplication for two matrix
 */
public class MatrixMultiplication {
  private MatrixChecker checker = new MatrixChecker();
  private BigDecimal[][] resultMatrix;

  /**
   * Multiplies two matrix
   * @param leftMatrix - left input matrix
   * @param rightMatrix - right input matrix
   * @return BigDecimal[][] - matrix with result of multiplication
   */
  public BigDecimal[][] multiply(BigDecimal[][] leftMatrix, BigDecimal[][] rightMatrix) {
    if (!checker.checkMatrixForMultiplication(leftMatrix, rightMatrix)) {
      throw new IllegalArgumentException();
    }
    resultMatrix = new BigDecimal[leftMatrix.length][rightMatrix[0].length];
    initializeResultMatrixByZeros();
    multiplyTwoMatrix(leftMatrix, rightMatrix);
    return resultMatrix;
  }

  private void initializeResultMatrixByZeros() {
    for (int i = 0; i < resultMatrix.length; i++) {
      for (int j = 0; j < resultMatrix[0].length; j++) {
        resultMatrix[i][j] = new BigDecimal(0);
      }
    }
  }

  /**
   * Calculates result of two matrix multiplication
   * @param leftMatrix - left input matrix
   * @param rightMatrix - right input matrix
   */
  private void multiplyTwoMatrix(BigDecimal[][] leftMatrix, BigDecimal[][] rightMatrix) {
    for (int row = 0; row < resultMatrix.length; row++) {
      for (int col = 0; col < resultMatrix[0].length; col++) {
        for (int inner = 0; inner < resultMatrix.length; inner++) {
          BigDecimal multiplicationResult = leftMatrix[row][inner].multiply(rightMatrix[inner][col]);
          resultMatrix[row][col] = resultMatrix[row][col].add(multiplicationResult);
        }
      }
    }
  }
}
