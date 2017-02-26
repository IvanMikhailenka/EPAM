package task.dev6.date.dateFormat.millisecondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting milliseconds from date, for "F" pattern
 * if not nullable value, then only tenths of a second
 * E.g. 2009-06-15T13:45:30.617 -> 6
 * E.g. 2009-06-15T13:45:30.050 -> ""
 */
public class millisecondsAsF extends DateFormat {

  /**
   * Returns milliseconds as one digit number
   */
  @Override
  public String getFormat() {
    String milliseconds = String.valueOf(information.getMillisecond());
    if (milliseconds.startsWith("0")) {
      return "";
    }
    return milliseconds.substring(0, 1);
  }
}
