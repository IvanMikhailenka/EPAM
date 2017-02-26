package task.dev6.date.formatFactory;

import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.monthFormat.*;

/**
 * Provides method for creating month date format object by input pattern
 */
public class MonthFormatFactory implements DateFactory {
  @Override
  public DateFormat getDateFormat(String datePattern) {
    if (datePattern.equals("M")) {
      return new MonthAs_M();
    }
    if (datePattern.equals("MM")) {
      return new MonthAs_MM();
    }
    if (datePattern.equals("MMM")) {
      return new MonthAs_MMM();
    }
    if (datePattern.equals("MMMM")) {
      return new MonthAs_MMMM();
    }
    return null;
  }
}
