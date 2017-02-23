package task.dev5.developerTeam;

import task.dev5.entity.employee.developer.Developer;

import java.util.List;

/**
 * Provides methods for getting global information about developers team
 */
class TeamInformation {

  /**
   * Calculate total team price
   * @param developers - developers team
   * @return int - total team price
   */
  int getPrice(List<Developer> developers) {
    int price = 0;
    for (Developer developer : developers) {
      price += developer.getSalary();
    }
    return price;
  }

  /**
   * Calculate total team productivity
   * @param developers - developers team
   * @return int - total team productivity
   */
  int getProductivity(List<Developer> developers) {
    int productivity = 0;
    for (Developer developer : developers) {
      productivity += developer.getProductivity();
    }
    return productivity;
  }
}
