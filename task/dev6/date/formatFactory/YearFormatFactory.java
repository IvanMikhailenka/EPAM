package task.dev6.date.formatFactory;

import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.yearFormat.*;

/**
 * Provides method for creating year date format object by input pattern
 */
public class YearFormatFactory implements DateFactory {
  @Override
  public DateFormat getDateFormat(String datePattern) {
    if (datePattern.equals("y")) {
      return new YearAs_y();
    }
    if (datePattern.equals("yy")) {
      return new YearAs_yy();
    }
    if (datePattern.equals("yyy")) {
      return new YearAs_yyy();
    }
    if (datePattern.equals("yyyy")) {
      return new YearAs_yyyy();
    }
    return null;
  }
}
