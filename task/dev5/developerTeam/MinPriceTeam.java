package task.dev5.developerTeam;

import task.dev5.entity.employee.developer.Developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides method to build team with min price by productivity
 */
public class MinPriceTeam implements DeveloperTeamBuilder {
  private List<Developer> minPriceTeam;
  private TeamInformation teamInformation = new TeamInformation();
  private int maxPrice;
  private int maxProductivity;

  public MinPriceTeam(int maxProductivity) {
    this.maxProductivity = maxProductivity;
  }

  /**
   * Build team with min price by productivity
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
    return minPriceTeam;
  }

  /**
   * Check total price and productivity between max productivity team and getting team
   * @param developers - getting team
   */
  private void checkMaxProductivityTeam(List<Developer> developers) {
    int developersProductivity = teamInformation.getProductivity(developers);
    if (minPriceTeam == null && developersProductivity <= maxProductivity) {
      minPriceTeam = developers;
      maxPrice = teamInformation.getPrice(developers);
    } else if (developersProductivity <= maxProductivity && developersProductivity >=
        teamInformation.getProductivity(minPriceTeam) && teamInformation.getPrice(developers) <=
        maxPrice) {
      minPriceTeam = developers;
      maxPrice = teamInformation.getPrice(developers);
    }
  }
}
