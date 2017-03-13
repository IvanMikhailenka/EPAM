package task.dev6.date.dateFormat.yearFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting year from date, for "yyy" pattern
 * E.g. 0001-01-01T00:00:00 -> 0001
 * E.g. 1900-01-01T00:00:00 -> 1900
 * E.g. 2009-06-15T13:45:30 -> 2009
 * E.g. 2019-06-15T13:45:30 -> 2019
 */
public class YearAs_yyyy extends DateFormat {

  /**
   * Returns year as fore-digit number
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getYear());
  }
}
