package task.dev6.date.formatFactory;

import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.minutesFormat.MinutesAs_m;
import task.dev6.date.dateFormat.minutesFormat.MinutesAs_mm;

/**
 * Provides method for creating minutes date format object by input pattern
 */
public class MinutesFormatFactory implements DateFactory {
  @Override
  public DateFormat getDateFormat(String datePattern) {
    if (datePattern.equals("m")) {
      return new MinutesAs_m();
    }
    if (datePattern.equals("mm")) {
      return new MinutesAs_mm();
    }
    return null;
  }
}
