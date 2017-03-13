package task.dev6.date;

import java.util.Calendar;
import java.util.Date;

/**
 * Provides information about input date
 */
public class DateInformation {
  private Date date;
  private Calendar calendar = Calendar.getInstance();

  public DateInformation(Date date) {
    this.date = date;
    calendar.setTime(date);
  }

  /**
   * Returns day of month as number.
   * E.g. first day of month is - 1
   */
  public int getDay() {
    return calendar.get(Calendar.DATE);
  }

  /**
   * Returns day of week as number. From 1 to 7
   * First day is Sunday
   */
  public int getDayOfWeek() {
    return calendar.get(Calendar.DAY_OF_WEEK);
  }

  /**
   * Returns month of year as number. From 0 to 11
   * First month is January
   */
  public int getMonth() {
    return calendar.get(Calendar.MONTH);
  }

  /**
   * Returns year as number.
   */
  public int getYear() {
    return calendar.get(Calendar.YEAR);
  }

  /**
   * Returns minute as number. From 0 to 59
   */
  public int getMinute() {
    return calendar.get(Calendar.MINUTE);
  }

  /**
   * Returns seconds as number. From 0 to 59
   */
  public int getSeconds() {
    return calendar.get(Calendar.SECOND);
  }

  /**
   * Returns milliseconds as three-digit number. From 0 to 999
   */
  public int getMillisecond() {
    return calendar.get(Calendar.MILLISECOND);
  }

  /**
   * Returns era as number.
   * 1 - A.D
   * 0 - D.C.
   */
  public int getEra() {
    return calendar.get(Calendar.ERA);
  }

  /**
   * Returns name of timezone.
   * E.g. Moscow
   */
  public String getTimezone() {
    return calendar.getTimeZone().getDisplayName();
  }
}
