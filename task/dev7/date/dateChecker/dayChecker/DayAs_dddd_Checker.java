package task.dev7.date.dateChecker.dayChecker;

import task.dev7.date.dateChecker.DateChecker;

/**
 * Provides method for checking day from date, for "dddd" pattern
 * E.g. Sunday -> true
 * E.g. 01 -> false
 */
public class DayAs_dddd_Checker implements DateChecker {

  /**
   * Check is the input date is day of week with full name
   * @param date - input day
   * @return boolean - true if input date is day of week
   */
  @Override
  public boolean checkDate(String date) {
    return DaysOfWeek.DAYS_OF_WEEK.contains(date);
  }
}
