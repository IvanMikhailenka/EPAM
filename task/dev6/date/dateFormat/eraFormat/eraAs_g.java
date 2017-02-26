package task.dev6.date.dateFormat.eraFormat;

import task.dev6.date.dateFormat.DateFormat;

/**
 * Provides method for getting era from date, for "g" pattern
 */
public class eraAs_g extends DateFormat {
  private static String BEFORE_CHRIST = "B.C.";
  private static String ANNO_DOMINI = "A.D";

  /**
   * Returns era
   */
  @Override
  public String getFormat() {
    if (information.getEra() == 1) {
      return ANNO_DOMINI;
    } else {
      return BEFORE_CHRIST;
    }
  }
}
