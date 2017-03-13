package task.dev6.date.dateFormat.yearFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting year from date, for "yyy" pattern
 * E.g. 0001-01-01T00:00:00 -> 001
 * E.g. 1900-01-01T00:00:00 -> 900
 * E.g. 2009-06-15T13:45:30 -> 009
 * E.g. 2019-06-15T13:45:30 -> 019
 */
public class YearAs_yyy extends DateFormat {

  /**
   * Returns year as three-digit number
   */
  @Override
  public String getFormat() {
    String year = String.valueOf(information.getYear());
    String shortYear = year.substring(1);
    if (year.startsWith("0")) {
      return shortYear;
    }
    return year;
  }
}
