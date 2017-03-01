package task.dev5.developerTeam;

import task.dev5.entity.employee.developer.Developer;

import java.util.List;

/**
 * Determines behavior for different developer team builders
 */
public interface DeveloperTeamBuilder {

  /**
   * Build team by unique rules
   * @param developers - all developers
   */
  void buildTeam(List<Developer> developers);

  /**
   * Returns built team
   */
  List<Developer> getTeam();
}
