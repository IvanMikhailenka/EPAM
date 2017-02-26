package task.dev6.date.dateFormat.millisecondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting milliseconds from date, for "FFF" pattern
 * if not nullable value, then only thousandths of a second
 * E.g. 2009-06-15T13:45:30.617 -> 617
 * E.g. 2009-06-15T13:45:30.000 -> ""
 */
public class millisecondsAsFFF extends DateFormat {

  /**
   * Returns milliseconds as three-digit number
   */
  @Override
  public String getFormat() {
    String milliseconds = String.valueOf(information.getMillisecond());
    if (milliseconds.equals("000")) {
      return "";
    }
    return milliseconds;
  }
}
