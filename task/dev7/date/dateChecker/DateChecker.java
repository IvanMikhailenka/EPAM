package task.dev7.date.dateChecker;

/**
 * Determines behavior for checking input date by different patterns
 */
public interface DateChecker {

  /**
   * Checks input date
   * @param date - input date
   * @return boolean - true if input date complies some pattern
   */
  boolean checkDate(String date);
}
