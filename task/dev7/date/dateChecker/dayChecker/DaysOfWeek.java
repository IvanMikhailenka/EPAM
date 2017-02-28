package task.dev7.date.dateChecker.dayChecker;

import java.util.Arrays;
import java.util.List;

/**
 * Determines names of day of week, with cam be used when when working with day format
 * First day - Sunday, Lust - Saturday
 */
final class DaysOfWeek {
  static final List<String> DAYS_OF_WEEK = Arrays.asList(
      "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
  );

  private DaysOfWeek() {
  }
}
