package task.dev6.date.dateFormat.millisecondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting milliseconds from date, for "fff" pattern
 * E.g. 2009-06-15T13:45:30.617 -> 617
 * E.g. 2009-06-15T13:45:30.050 -> 050
 */
public class millisecondsAs_fff extends DateFormat {

  /**
   * Returns milliseconds as three-digit number
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getMillisecond());
  }
}
