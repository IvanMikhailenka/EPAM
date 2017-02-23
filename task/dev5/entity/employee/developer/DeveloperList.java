package task.dev5.entity.employee.developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Hard code class. Need to create some Developer objects
 */
public class DeveloperList {
  private static final String JUNIOR_QUALIFICATION = "Junior";
  private static final String MIDDLE_QUALIFICATION = "Middle";
  private static final String SENIOR_QUALIFICATION = "Senior";
  private static final String LEAD_QUALIFICATION = "Lead";
  private List<Developer> developerList = new ArrayList<>();

  public DeveloperList() {
    fillDeveloperList();
  }

  public List<Developer> getDeveloperList() {
    return developerList;
  }

  /**
   * Fill list of developers by Developer object.
   * Developer object constructor - (Qualification, salary, productivity)
   */
  private void fillDeveloperList() {
    for(int i = 0; i<1 ; i++){
      developerList.add(new Developer(JUNIOR_QUALIFICATION,10, 60));
      developerList.add(new Developer(MIDDLE_QUALIFICATION,20,100));
      developerList.add(new Developer(MIDDLE_QUALIFICATION,20,100));

      developerList.add(new Developer(SENIOR_QUALIFICATION,30,200));
      //developerList.add(new Developer(LEAD_QUALIFICATION,350,4));
    }
  }
}
