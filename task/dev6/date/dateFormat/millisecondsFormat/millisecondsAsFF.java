package task.dev6.date.dateFormat.millisecondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting milliseconds from date, for "FF" pattern
 * if not nullable value, then only hundredths of a second
 * E.g. 2009-06-15T13:45:30.617 -> 61
 * E.g. 2009-06-15T13:45:30.005 -> ""
 */
public class millisecondsAsFF extends DateFormat {

  /**
   * Returns milliseconds as two-digit number
   */
  @Override
  public String getFormat() {
    String milliseconds = String.valueOf(information.getMillisecond());
    if (milliseconds.startsWith("00")) {
      return "";
    }
    return milliseconds.substring(0, 2);
  }
}
