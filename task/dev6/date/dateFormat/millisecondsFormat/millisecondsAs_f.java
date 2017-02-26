package task.dev6.date.dateFormat.millisecondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting milliseconds from date, for "f" pattern
 * E.g. 2009-06-15T13:45:30.617 -> 6
 * E.g. 2009-06-15T13:45:30.05 -> 0
 */
public class MillisecondsAs_f extends DateFormat {

  /**
   * Returns milliseconds as ont-digit number
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getMillisecond()).substring(0, 1);
  }
}
