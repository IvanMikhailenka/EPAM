package task.dev6.date.dateFormat.dayFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting day from date, for "d" pattern
 * E.g. 26.02.2017 -> 26
 * E.g. 01.02.2017 -> 1
 */
public class DayAs_d extends DateFormat {

  /**
   * Returns day from input date
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getDay());
  }
}
