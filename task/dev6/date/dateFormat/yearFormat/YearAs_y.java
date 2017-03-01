package task.dev6.date.dateFormat.yearFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting year from date, for "y" pattern
 * E.g. 0001-01-01T00:00:00 -> 1
 * E.g. 1900-01-01T00:00:00 -> 0
 * E.g. 2009-06-15T13:45:30 -> 9
 * E.g. 2019-06-15T13:45:30 -> 19
 */
public class YearAs_y extends DateFormat {

  /**
   * Returns year
   */
  @Override
  public String getFormat() {
    String year = String.valueOf(information.getYear());
    String shortYear = year.substring(2);
    if (shortYear.startsWith("0")) {
      return shortYear.substring(1);
    }
    return shortYear;
  }
}
