package task.dev3.service.averageAge;

import task.dev3.entity.user.User;

import java.util.List;

/**
 * Provides method fot getting users average age
 */
public class UsersAverageAge implements AverageAge {
  private List<User> userList;

  public UsersAverageAge(List<User> userList) {
    this.userList = userList;
  }

  /**
   * Returns users average age form user list
   */
  @Override
  public int getAverageAge() {
    int totalAge = 0;
    for (User user : userList) {
      totalAge += user.getAge();
    }
    return totalAge / userList.size();
  }
}
