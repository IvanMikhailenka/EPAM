package task.dev6.date.dateFormat.dayFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting day from date, for "dddd" pattern
 * E.g. 26.02.2017 -> Sunday
 * E.g. 01.02.2017 -> Wednesday
 */
public class DayAs_dddd extends DateFormat {

  /**
   * Returns day from input date as day of week
   */
  @Override
  public String getFormat() {
    return DaysOfWeek.DAYS_OF_WEEK.get(information.getDayOfWeek() - 1);
  }
}
