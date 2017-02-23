package task.dev5.entity.employee.developer;

/**
 * Simple entity for developer
 */
public class Developer {
  private String qualification;
  private int salary;
  private int productivity;

  public Developer(String qualification, int salary, int productivity) {
    this.qualification = qualification;
    this.salary = salary;
    this.productivity = productivity;
  }

  public String getQualification() {
    return qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getProductivity() {
    return productivity;
  }

  public void setProductivity(int productivity) {
    this.productivity = productivity;
  }

  /**
   * Returns all developer fields as String
   */
  @Override
  public String toString() {
    return qualification +
        ": salary=" + salary +
        ", productivity=" + productivity;
  }
}
