package task.dev5.developerTeam;

import task.dev5.entity.employee.developer.Developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides method to build team with max amount of some qualification
 * and min amount of other
 */
public class QualificationTeam implements DeveloperTeamBuilder {
  private List<Developer> minQualificationTeam = new ArrayList<>();
  private List<Developer> allDevelopers;
  private List<Developer> otherQualificationTeam;
  private String qualification;
  private int maxProductivity;
  private int buildProductivity;
  private TeamInformation teamInformation = new TeamInformation();

  public QualificationTeam(int maxProductivity, String qualification) {
    this.maxProductivity = maxProductivity;
    this.qualification = qualification;
  }

  /**
   * Build team with max amount of some qualification and min amount of other, by productivity
   * @param developers - all developers
   */
  @Override
  public void buildTeam(List<Developer> developers) {
    allDevelopers = developers;
    buildWithOneQualification();
    maxProductivity -= buildProductivity;
    buildOtherQualificationTeam(allDevelopers);
    minQualificationTeam.addAll(otherQualificationTeam);
  }

  @Override
  public List<Developer> getTeam() {
    return minQualificationTeam;
  }

  /**
   * Build team with max amount of one qualification
   */
  private void buildWithOneQualification() {
    buildProductivity = 0;
    for (int i = 0; i < allDevelopers.size(); i++) {
      Developer developer = allDevelopers.get(i);
      if (developer.getQualification().equalsIgnoreCase(qualification)
          && buildProductivity < maxProductivity) {
        minQualificationTeam.add(developer);
        buildProductivity += developer.getProductivity();
        allDevelopers.remove(i);
      }
    }
  }

  /**
   * Check total amount of developers between getting team and
   * team with not input qualification, and select smallest productivity team
   * @param developers - input team
   */
  private void checkMinAmountTeam(List<Developer> developers) {
    int developersProductivity = teamInformation.getProductivity(developers);
    if (otherQualificationTeam == null && developersProductivity <= maxProductivity) {
      otherQualificationTeam = developers;
    } else if (developersProductivity <= maxProductivity && teamInformation.getProductivity
        (otherQualificationTeam) <= developersProductivity && otherQualificationTeam.size() >=
        developers.size()) {
      otherQualificationTeam = developers;
    }
  }

  /**
   * Build team with not input qualification
   * @param developers - input team
   */
  private void buildOtherQualificationTeam(List<Developer> developers) {
    if (!developers.isEmpty()) {
      checkMinAmountTeam(developers);
    }
    for (int i = 0; i < developers.size(); i++) {
      List<Developer> developerList = new ArrayList<>(developers);
      developerList.remove(i);
      buildOtherQualificationTeam(developerList);
    }
  }
}
