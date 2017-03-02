package task8.matrixMultiplication;

import java.math.BigDecimal;

/**
 * Provides method for checking matrix multiplication opportunity
 * E.g. firstMatrix[3][4] and secondMatrix[4][3] -> true
 * E.g. firstMatrix[3][3] and secondMatrix[4][2] -> false
 */
class MatrixChecker {

  /**
   * Checks matrix multiplication opportunity
   * @param firstMatrix  - first input matrix
   * @param secondMatrix - second input matrix
   * @return boolean - true if amount of row in firstMatrix = amount of column in secondMatrix
   */
  boolean checkMatrixForMultiplication(BigDecimal[][] firstMatrix, BigDecimal[][]
      secondMatrix) {
    return firstMatrix.length == secondMatrix[0].length;
  }
}
