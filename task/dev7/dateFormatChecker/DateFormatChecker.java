package task.dev7.dateFormatChecker;

/**
 * Determine behavior for checking input date for compliance with date format patterns
 */
public interface DateFormatChecker {

  /**
   * Check input date for compliance with date format patterns
   * @param date - input date
   * @return boolean - true if input date compliance with all date format patterns
   */
  boolean checkDateFormat(String date);
}
