package task.dev6.date.dateFormat;

import task.dev6.date.DateInformation;

/**
 * Provides method for getting fate in different formats
 */
public abstract class DateFormat {
  protected DateInformation information;

  public void setInformation(DateInformation information) {
    this.information = information;
  }

  /**
   * Returns date if different formats
   */
  public abstract String getFormat();
}
