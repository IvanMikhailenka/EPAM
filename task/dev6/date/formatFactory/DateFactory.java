package task.dev6.date.formatFactory;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Determines behavior for date format factory
 */
public interface DateFactory {

  /**
   * Create date format for input pattern
   * @param datePattern - input date pattern, e.g. "MMMM"
   * @return DateFormat - object witch convert date by input pattern
   */
  DateFormat getDateFormat(String datePattern);
}
