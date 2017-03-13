package task.dev6.date.dateFormat.yearFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting year from date, for "yy" pattern
 * E.g. 0001-01-01T00:00:00 -> 01
 * E.g. 1900-01-01T00:00:00 -> 00
 * E.g. 2009-06-15T13:45:30 -> 09
 * E.g. 2019-06-15T13:45:30 -> 19
 */
public class YearAs_yy extends DateFormat {

  /**
   * Returns year as two-digit number
   */
  @Override
  public String getFormat() {
    String year = String.valueOf(information.getYear());
    return year.substring(2);
  }
}
