package task.dev6.date.dateFormat.monthFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting month from date, for "M" pattern
 * E.g. 2009-06-15T13:45:30 -> 6
 */
public class MonthAs_M extends DateFormat  {

  /**
   * Return month
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getMonth()+1);
  }
}
