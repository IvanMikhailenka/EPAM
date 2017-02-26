package task.dev6.date.formatFactory;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting date format object by input pattern
 */
public class GlobalDateFormatFactory implements DateFactory {

  /**
   * Choose type of input date pattern
   * @param datePattern - input date pattern, e.g. "MMMM"
   * @return DateFormat - object witch convert date by input pattern
   */
  public DateFormat getDateFormat(String datePattern) {
    if (datePattern.contains("d")) {
      return new DayFormatFactory().getDateFormat(datePattern);
    }
    if (datePattern.contains("f") || datePattern.contains("F")) {
      return new MillisecondsFormatFactory().getDateFormat(datePattern);
    }
    if (datePattern.contains("m")) {
      return new MinutesFormatFactory().getDateFormat(datePattern);
    }
    if (datePattern.contains("y")) {
      return new YearFormatFactory().getDateFormat(datePattern);
    }
    if (datePattern.contains("M")) {
      return new MonthFormatFactory().getDateFormat(datePattern);
    }
    return null;
  }
}
