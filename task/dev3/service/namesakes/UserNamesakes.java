package task.dev3.service.namesakes;

import task.dev3.entity.user.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Provides method for getting namesakes
 */
public class UserNamesakes implements Namesakes {
  private List<User> userList;

  public UserNamesakes(List<User> userList) {
    this.userList = userList;
  }

  /**
   * Calculate and returns list with namesakes
   */
  @Override
  public List getNamesakes() {
    List<User> namesakes = new ArrayList<>();
    Set<User> namesakesSet = new HashSet<>();
    for (int i = 0; i < userList.size(); i++) {
      User user = userList.get(i);
      for (int j = i; j < userList.size(); j++) {
        if (user.getSurname().equals(userList.get(i).getSurname())) {
          namesakesSet.add(user);
          namesakesSet.add(userList.get(i));
        }
      }
    }
    namesakes.addAll(namesakesSet);
    return namesakes;
  }
}
