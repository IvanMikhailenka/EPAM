package task.dev6.date.dateFormat.monthFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting month from date, for "MM" pattern
 * E.g. 2009-06-15T13:45:30 -> 06
 */
public class MonthAs_MM extends DateFormat {

  /**
   * Returns month as two-digit number
   */
  @Override
  public String getFormat() {
    String month = String.valueOf(information.getMonth() + 1);
    if (month.length() == 1) {
      return new StringBuilder(month).insert(0, "0").toString();
    }
    return month;
  }
}
