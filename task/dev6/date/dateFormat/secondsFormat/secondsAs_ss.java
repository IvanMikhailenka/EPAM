package task.dev6.date.dateFormat.secondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting seconds from date, for "ss" pattern
 * E.g. 2009-06-15T13:45:09 -> 09
 */
public class secondsAs_ss extends DateFormat {

  /**
   * Returns seconds as two-digit number
   */
  @Override
  public String getFormat() {
    String seconds = String.valueOf(information.getSeconds());
    if (seconds.length() == 1) {
      return new StringBuilder(seconds).insert(0, "0").toString();
    }
    return seconds;
  }
}
