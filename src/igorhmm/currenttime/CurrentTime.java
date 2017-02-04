package igorhmm.currenttime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Class to determine current system time
 */
public class CurrentTime {
  /**
   * Returns current system time in given format, like HH:mm
   *
   * param timeFormat Desirable format for current time output
   * returns current time
   */
  public static String getTime (String timeFormat) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(timeFormat);
    return sdf.format(cal.getTime());
  }
}