package task.dev3.view;

import task.dev3.entity.Gender;
import task.dev3.entity.user.User;
import task.dev3.reader.ConsoleReader;
import task.dev3.service.averageAge.UsersAverageAge;
import task.dev3.service.mostPopularName.MostPopularUserName;
import task.dev3.service.namesakes.UserNamesakes;
import task.dev3.service.oldestEntity.OldestUser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides method for dialogue with users
 */
public class UserConsoleView {
  private List<User> userList = new ArrayList<>();

  /**
   * Conducts console dialogue with client
   * @throws IOException - throws if problems with input data
   */
  public void showConsoleDialog() throws IOException {
    AddUserConsoleView addUserConsoleView = new AddUserConsoleView(new ConsoleReader());
    userList = addUserConsoleView.addUserConsoleDialog();
    AllOptionsConsoleView allOptionsConsoleView = new AllOptionsConsoleView();
    fullInitializeAllOptionsConsoleView(allOptionsConsoleView);
    allOptionsConsoleView.showAllOptionsConsoleDialog();
  }

  /**
   * Designed to initialize all AllOptionsConsoleView fields
   * @param consoleView - consoleView which need to initialize
   */
  private void fullInitializeAllOptionsConsoleView(AllOptionsConsoleView consoleView) {
    consoleView.setAverageAge(new UsersAverageAge(userList));
    consoleView.setMostPopularName(new MostPopularUserName(userList, Gender.WOMAN));
    consoleView.setNamesakes(new UserNamesakes(userList));
    consoleView.setOldestEntity(new OldestUser(userList));
    consoleView.setReader(new ConsoleReader());
  }
}
