package task.dev6.date.formatFactory;

import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.dayFormat.*;

/**
 * Provides method for getting day date format by input pattern
 */
public class DayFormatFactory implements DateFactory {
  public DateFormat getDateFormat(String datePattern) {
    if (datePattern.equals("d")) {
      return new DayAs_d();
    }
    if (datePattern.equals("dd")) {
      return new DayAs_dd();
    }
    if (datePattern.equals("ddd")) {
      return new DayAs_ddd();
    }
    if (datePattern.equals("dddd")) {
      return new DayAs_dddd();
    }
    return null;
  }
}
