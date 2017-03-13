package task.dev6.date.dateFormat.monthFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting month from date, for "MMM" pattern
 * E.g. 2009-06-15T13:45:30 -> Jun
 */
public class MonthAs_MMM extends DateFormat {

  /**
   * Returns short name of month
   */
  @Override
  public String getFormat() {
    String monthAsString = MonthsInYear.MONTH_IN_YEAR.get(information.getMonth());
    return monthAsString.substring(0, 3);
  }
}
