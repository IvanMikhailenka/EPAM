package task.dev6.date.dateFormat.secondsFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting seconds from date, for "s" pattern
 * E.g. 2009-06-15T13:45:09 -> 9
 */
public class secondsAs_s extends DateFormat {

  /**
   * Returns seconds
   */
  @Override
  public String getFormat() {
    return String.valueOf(information.getSeconds());
  }
}
