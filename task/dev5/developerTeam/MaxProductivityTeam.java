package task.dev5.developerTeam;

import task.dev5.entity.employee.developer.Developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides method to build team with max productivity by price
 */
public class MaxProductivityTeam implements DeveloperTeamBuilder {
  private List<Developer> maxProductivityTeam;
  private TeamInformation teamInformation = new TeamInformation();
  private int maxPrice;
  private int maxProductivity;

  public MaxProductivityTeam(int maxPrice) {
    this.maxPrice = maxPrice;
  }

  /**
   * Build team with max productivity by price
   * @param developers - all developers
   */
  @Override
  public void buildTeam(List<Developer> developers) {
    if (!developers.isEmpty()) {
      checkMaxProductivityTeam(developers);
    }
    for (int i = 0; i < developers.size(); i++) {
      List<Developer> developerList = new ArrayList<>(developers);
      developerList.remove(i);
      buildTeam(developerList);
    }
  }

  @Override
  public List<Developer> getTeam() {
    return maxProductivityTeam;
  }

  /**
   * Check total price and productivity between max productivity team and getting team
   * @param developers - getting team
   */
  private void checkMaxProductivityTeam(List<Developer> developers) {
    if (maxProductivityTeam == null && teamInformation.getPrice(developers) <= maxPrice) {
      maxProductivityTeam = developers;
      maxProductivity = teamInformation.getProductivity(developers);
    } else if (teamInformation.getPrice(developers) <= maxPrice &&
        teamInformation.getProductivity(developers) > maxProductivity) {
      maxProductivityTeam = developers;
      maxProductivity = teamInformation.getProductivity(developers);
    }
  }

}
