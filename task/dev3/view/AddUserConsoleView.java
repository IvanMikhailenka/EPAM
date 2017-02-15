package task.dev3.view;

import task.dev3.entity.Gender;
import task.dev3.entity.user.User;
import task.dev3.reader.Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides methods to 'add user' dialogue
 */
public class AddUserConsoleView {
  private static final String YES = "y";
  private List<User> userList = new ArrayList<>();
  private Reader reader;

  public AddUserConsoleView(Reader reader) {
    this.reader = reader;
  }

  /**
   * Asks client if he wants to create a new user
   * @return List<User> - all created users by client
   */
  public List<User> addUserConsoleDialog() {
    try {
      while (askClient().equalsIgnoreCase(YES)) {
        userList.add(newUser());
      }
    } catch (Exception e) {
      System.out.println("Incorrect user data, please try again");
      addUserConsoleDialog();
      // TODO: add stackTrace to log
    }
    return userList;
  }

  /**
   * Writes question to console and return answer
   * @return String - answer
   * @throws IOException - throws if problems with input data
   */
  private String askClient() throws IOException {
    System.out.println("Do you want to add a user? Y/N");
    return reader.read();
  }

  /**
   * Ask to input information for creating new user
   * @return User - new User
   * @throws IOException - throws if some information was incorrect
   */
  private User newUser() throws IOException {
    User user = new User();
    System.out.println("Please input name");
    user.setName(reader.read());
    System.out.println("Please input surname");
    user.setSurname(reader.read());
    System.out.println("Please input gender : MAN/WOMAN");
    user.setGender(getGenderFromString(reader.read()));
    System.out.println("Please input age");
    user.setAge(checkAndReturnAge(reader.read()));
    return user;
  }

  /**
   * Check if user input incorrect age, e.g. below zero
   * @param age - input age
   * @return int - correct age
   * @throws IOException - throws if problems with input data
   */
  private int checkAndReturnAge(String age) throws IOException {
    final int MIN_POSSIBLE_AGE = 0;
    if (Integer.parseInt(age) < MIN_POSSIBLE_AGE)
      throw new IOException();
    return Integer.parseInt(age);
  }

  /**
   * @param gender - input gender
   * @return Gender - gender as Enum
   * @throws IOException - throw if input gender not supported
   */
  private Gender getGenderFromString(String gender) throws IOException {
    if (gender.equalsIgnoreCase(String.valueOf(Gender.MAN)))
      return Gender.MAN;
    else if (gender.equalsIgnoreCase(String.valueOf(Gender.WOMAN))) {
      return Gender.WOMAN;
    } else
      throw new IOException("unsupported Gender");
  }
}
