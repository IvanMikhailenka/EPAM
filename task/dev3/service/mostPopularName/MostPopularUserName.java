package task.dev3.service.mostPopularName;

import task.dev3.entity.Gender;
import task.dev3.entity.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Provides method for getting most popular name by gender
 */
public class MostPopularUserName implements MostPopularName {
  private List<User> userList;
  private Gender gender;

  public MostPopularUserName(List<User> userList, Gender gender) {
    this.userList = userList;
    this.gender = gender;
  }

  /**
   * Returns list of most popular names from user list
   */
  @Override
  public List<String> getMostPopularName() {
    List<String> mostPopularNames = new ArrayList<>();
    Map<String, Integer> nameAmountMap = getNameAmount();
    int maxNameAmount = getMaxNameAmount(nameAmountMap);
    for (Map.Entry<String, Integer> nameAmount : nameAmountMap.entrySet()) {
      if (maxNameAmount == nameAmount.getValue())
        mostPopularNames.add(nameAmount.getKey());
    }
    return mostPopularNames;
  }

  /**
   * Calculate how often some name meets in user list
   * @return Map - Key : name, Value : amount
   */
  private Map<String, Integer> getNameAmount() {
    Map<String, Integer> nameMap = new HashMap<>();
    for (User user : userList) {
      if (!user.getGender().equals(gender))
        continue;
      String userName = user.getName();
      int counter = 1;
      if (nameMap.containsKey(userName)) {
        counter = nameMap.get(userName) + 1;
        nameMap.put(userName, counter);
      } else
        nameMap.put(userName, counter);
    }
    return nameMap;
  }

  /**
   * Search max amount among identical names
   * @param nameAmountMap - map with calculated amount of each name
   * @return int - max name amount
   */
  private int getMaxNameAmount(Map<String, Integer> nameAmountMap) {
    int maxNameAmount = 0;
    for (Map.Entry<String, Integer> nameAmount : nameAmountMap.entrySet()) {
      if (maxNameAmount < nameAmount.getValue())
        maxNameAmount = nameAmount.getValue();
    }
    return maxNameAmount;
  }
}
