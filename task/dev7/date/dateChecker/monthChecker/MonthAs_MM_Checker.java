package task.dev7.date.dateChecker.monthChecker;

import task.dev7.date.dateChecker.DateChecker;

/**
 * Provides method for checking month from date, for "MM" pattern
 * E.g. 2009-06-15T13:45:30 -> true
 * E.g. 2009-Feb-15T13:45:30 -> false
 */
public class MonthAs_MM_Checker implements DateChecker {
  private static final String ALL_DIGIT = "\\d+";

  /**
   * Checks whether input month a two-digit number
   * @param date - input month
   * @return boolean - true if input month a two-digit number
   */
  @Override
  public boolean checkDate(String date) {
    if (date.length() == 2 && date.matches(ALL_DIGIT)) {
      int monthNumber = Integer.parseInt(date);
      return monthNumber > 0 && monthNumber < 13;
    }
    return false;
  }
}
