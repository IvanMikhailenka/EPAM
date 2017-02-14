package task.dev3.service.oldestEntity;

import task.dev3.entity.user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides method for getting oldest users
 */
public class OldestUser implements OldestEntity {
  private List<User> userList;

  public OldestUser(List<User> userList) {
    this.userList = userList;
  }

  /**
   * Returns list with oldest users from user list
   */
  @Override
  public List getOldest() {
    List<User> oldUserList = new ArrayList<>();
    int maxAge = getMaxAge();
    for (User user : userList) {
      if (user.getAge() == maxAge)
        oldUserList.add(user);
    }
    return oldUserList;
  }

  /**
   * Returns age of the oldest user
   */
  private int getMaxAge() {
    int maxAge = 0;
    for (User user : userList) {
      if (maxAge < user.getAge())
        maxAge = user.getAge();
    }
    return maxAge;
  }
}
