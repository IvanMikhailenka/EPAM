package task.dev6.date.dateFormat.dayFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting day from date, for "ddd" pattern
 * E.g. 26.02.2017 -> Sun
 * E.g. 01.02.2017 -> Wed
 */
public class DayAs_ddd extends DateFormat {

  /**
   * Returns day from input date as shot day of week
   * E.g. Sunday -> Sun
   */
  @Override
  public String getFormat() {
    String dayAsString = DaysOfWeek.DAYS_OF_WEEK.get(information.getDayOfWeek() - 1);
    return dayAsString.substring(0, 3);
  }
}
