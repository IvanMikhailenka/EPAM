package task.dev1.randomValuesSelectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Provides method for selecting random values from input data
 */
public class RandomValuesSelector {
  private static final String MESSAGE_NOT_ENOUGH_VALUES = "Not enough values for selection!";
  private static final String MESSAGE_NEGATIVE_NUMBER_OF_VALUES =
      "Negative number of items to elect!";

  /**
   * Select random value from input list
   * @param valueList - elements for sampling
   * @param numberOfValues - how many random values we want to get
   * @return List - list with selected random values
   * @throws IllegalArgumentException - throws when input incorrect valueList or numberOfValues
   */
  public List select(List valueList, int numberOfValues) {
    if (valueList.size() < numberOfValues) {
      throw new IllegalArgumentException(MESSAGE_NOT_ENOUGH_VALUES);
    }
    if (numberOfValues < 0) {
      throw new IllegalArgumentException(MESSAGE_NEGATIVE_NUMBER_OF_VALUES);
    }
    Random random = new Random();
    List selectedOptionsList = new ArrayList();
    for (int i = 0; i < numberOfValues; i++) {
      int randomValue = random.nextInt(valueList.size());
      selectedOptionsList.add(valueList.get(randomValue));
      valueList.remove(randomValue);
    }
    return selectedOptionsList;
  }

}
