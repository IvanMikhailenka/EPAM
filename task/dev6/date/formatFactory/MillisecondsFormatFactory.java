package task.dev6.date.formatFactory;

import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.millisecondsFormat.*;

/**
 * Provides method for creating milliseconds date format object by input pattern
 */
public class MillisecondsFormatFactory implements DateFactory {
  @Override
  public DateFormat getDateFormat(String datePattern) {
    if (datePattern.equals("f")) {
      return new millisecondsAs_f();
    }
    if (datePattern.equals("ff")) {
      return new millisecondsAs_ff();
    }
    if (datePattern.equals("fff")) {
      return new millisecondsAs_fff();
    }
    if (datePattern.equals("F")) {
      return new millisecondsAsF();
    }
    if (datePattern.equals("FF")) {
      return new millisecondsAsFF();
    }
    if (datePattern.equals("FFF")) {
      return new millisecondsAsFFF();
    }
    return null;
  }
}
