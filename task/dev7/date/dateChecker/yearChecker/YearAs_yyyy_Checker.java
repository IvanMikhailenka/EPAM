package task.dev7.date.dateChecker.yearChecker;

import task.dev7.date.dateChecker.DateChecker;

/**
 * Provides method for checking year from date, for "yyyy" pattern
 * E.g. 0001-01-01T00:00:00 -> true
 * E.g. 1900-01-01T00:00:00 -> true
 * E.g. 98-06-15T13:45:30 -> false
 * E.g. 20!9-06-15T13:45:30 -> false
 */
public class YearAs_yyyy_Checker implements DateChecker {
  private static final String ALL_DIGIT = "\\d+";

  /**
   * Checks whether input year a fore-digit number
   * @param date - input year
   * @return boolean - true if input year a fore-digit number
   */
  @Override
  public boolean checkDate(String date) {
    if (date.length() == 4 && date.matches(ALL_DIGIT)) {
      int year = Integer.parseInt(date);
      return year >= 0;
    }
    return false;
  }
}
