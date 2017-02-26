package task.dev6.date.dateFormat.minutesFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting minutes from date, for "mm" pattern
 * E.g. 2009-06-15T01:09:30 -> 09
 * E.g. 2009-06-15T13:29:30 -> 29
 */
public class MinutesAs_mm extends DateFormat {

  /**
   * Returns minutes as two-digit number
   */
  @Override
  public String getFormat() {
    String minutes = String.valueOf(information.getMinute());
    if (minutes.length() == 1) {
      return new StringBuilder(minutes).insert(0, "0").toString();
    }
    return minutes;
  }
}
