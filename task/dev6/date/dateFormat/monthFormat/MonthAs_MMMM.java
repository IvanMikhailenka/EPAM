package task.dev6.date.dateFormat.monthFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting month from date, for "MMMM" pattern
 * E.g. 2009-06-15T13:45:30 -> June
 */
public class MonthAs_MMMM extends DateFormat {

  /**
   * Returns full name of month
   */
  @Override
  public String getFormat() {
    return MonthsInYear.MONTH_IN_YEAR.get(information.getMonth());
  }
}
