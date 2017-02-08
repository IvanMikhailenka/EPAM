package task.dev1.randomValuesSelectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Select random values
 */
public class RandomValuesSelector {

  /**
   * Select random value from input list
   * @param valueList - elements for sampling
   * @param numberOfValues - how many random values we want to get
   * @return List - list with selected random values
   */
  public List select(List valueList, int numberOfValues) {
    if (valueList == null || valueList.size() < numberOfValues || numberOfValues < 0) {
      // TODO: add to log a reason
      return null;
    }
    Random random = new Random();
    List selectedOptionsList = new ArrayList();
    for (int i = 0; i < numberOfValues; i++) {
      int randomValue = random.nextInt(valueList.size());
      selectedOptionsList.add(valueList.get(randomValue));
    }
    return selectedOptionsList;
  }

}
