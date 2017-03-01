package task.dev5.controller;

import task.dev5.developerTeam.DeveloperTeamBuilder;
import task.dev5.developerTeam.MaxProductivityTeam;
import task.dev5.developerTeam.MinPriceTeam;
import task.dev5.developerTeam.QualificationTeam;
import task.dev5.entity.employee.developer.DeveloperList;
import task.dev5.reader.ConsoleReader;
import task.dev5.view.ConsoleView;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides method to exchange information between console user and program
 */
public class ConsoleController {
  private static final String EXCEPTION_MESSAGE = "an exception was thrown";
  private static final String QUALIFICATION = "Junior";
  private static Logger logger = Logger.getAnonymousLogger();
  private ConsoleView consoleView;
  private int price;
  private int productivity;
  private DeveloperTeamBuilder teamBuilder;

  /**
   * Start dialog between user and program
   */
  public void smartDialog() {
    consoleView = new ConsoleView(new ConsoleReader());
    try {
      price = consoleView.getPrice();
      productivity = consoleView.getProductivity();
      showOperationResult();
    } catch (Exception exception) {
      logger.log(Level.SEVERE, EXCEPTION_MESSAGE, exception);
      smartDialog();
    }
  }

  /**
   * Depending on user's choice shows necessary information
   * @throws IOException - throws if there are problems with input
   */
  private void showOperationResult() throws IOException {
    if (consoleView.checkMaxProductivityTeamAnswer()) {
      teamBuilder = new MaxProductivityTeam(price);
    } else if (consoleView.checkMinPriceTeamAnswer()) {
      teamBuilder = new MinPriceTeam(productivity);
    } else if (consoleView.checkQualificationTeamAnswer()) {
      teamBuilder = new QualificationTeam(productivity, QUALIFICATION);
    } else {
      return;
    }
    teamBuilder.buildTeam(new DeveloperList().getDeveloperList());
    consoleView.showInformation(String.valueOf(teamBuilder.getTeam()));
  }
}
