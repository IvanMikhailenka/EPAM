package task.dev6.date.dateFormat.millisecondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting milliseconds from date, for "ff" pattern
 * E.g. 2009-06-15T13:45:30.617 -> 61
 * E.g. 2009-06-15T13:45:30.05 -> 05
 */
public class millisecondsAs_ff extends DateFormat {

  /**
   * Returns milliseconds as two-digit number
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getMillisecond()).substring(0, 2);
  }
}
