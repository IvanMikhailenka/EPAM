package task.dev6.date.dateFormat.minutesFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting minutes from date, for "m" pattern
 * E.g. 2009-06-15T01:09:30 -> 9
 * E.g. 2009-06-15T13:29:30 -> 29
 */
public class MinutesAs_m extends DateFormat {

  /**
   * Returns minutes
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getMinute());
  }
}
