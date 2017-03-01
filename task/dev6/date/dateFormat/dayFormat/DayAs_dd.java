package task.dev6.date.dateFormat.dayFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting day from date, for "dd" pattern
 * E.g. 26.02.2017 -> 26
 * E.g. 01.02.2017 -> 01
 */
public class DayAs_dd extends DateFormat {

  /**
   * Returns day from input date
   */
  @Override
  public String getFormat() {
    String day = String.valueOf(information.getDay());
    if (day.length() == 1) {
      return new StringBuilder(day).insert(0, "0").toString();
    }
    return day;
  }
}
