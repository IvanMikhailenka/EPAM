package task.dev5.view;

import task.dev5.reader.Reader;

import java.io.IOException;

/**
 * Created by 1 on 21.02.2017.
 */
public class ConsoleView {
  private static final String YES = "Y";
  private Reader reader;

  public ConsoleView(Reader reader) {
    this.reader = reader;
  }

  /**
   * Ask user to input price
   * @return int - input price
   * @throws IOException - throws if there are problems with input
   */
  public int getPrice() throws IOException {
    System.out.println("Please input price");
    return Integer.parseInt(reader.read());
  }

  /**
   * Ask user to input productivity
   * @return int - productivity
   * @throws IOException - throws if there are problems with input
   */
  public int getProductivity() throws IOException {
    System.out.println("Please input productivity");
    return Integer.parseInt(reader.read());
  }

  /**
   * Ask user is he wont to show Max Productivity Team
   * @return boolean - true if he wont
   * @throws IOException - throws if there are problems with input
   */
  public boolean checkMaxProductivityTeamAnswer() throws IOException {
    System.out.println("Show team with max productivity by price? Y/N");
    return reader.read().equalsIgnoreCase(YES);
  }

  /**
   * Ask user is he wont to show Min Price Team
   * @return boolean - true if he wont
   * @throws IOException - throws if there are problems with input
   */
  public boolean checkMinPriceTeamAnswer() throws IOException {
    System.out.println("Show team with min price by productivity? Y/N");
    return reader.read().equalsIgnoreCase(YES);
  }

  /**
   * Ask user is he wont to show Qualification Team
   * @return boolean - true if he wont
   * @throws IOException - throws if there are problems with input
   */
  public boolean checkQualificationTeamAnswer() throws IOException {
    System.out.println("Show team by qualification? Y/N");
    return reader.read().equalsIgnoreCase(YES);
  }

  /**
   * Print some information to console
   * @param information - information which need to print
   */
  public void showInformation(String information) {
    System.out.println(information);
  }
}
