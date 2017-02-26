package task.dev6.date.dateFormat.timezoneFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting timezone from date, for "K" pattern
 * E.g. 2009-06-15T13:45:30, Moscow -> Moscow
 */
public class TimezoneAs_K extends DateFormat {

  /**
   * Returns timezone name
   */
  @Override
  public String getFormat() {
    return information.getTimezone();
  }
}
