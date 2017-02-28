package task.dev7.dateFormatChecker;

import task.dev7.date.dateChecker.DateChecker;
import task.dev7.date.dateChecker.dayChecker.DayAs_dddd_Checker;
import task.dev7.date.dateChecker.monthChecker.MonthAs_MM_Checker;
import task.dev7.date.dateChecker.yearChecker.YearAs_yyyy_Checker;

import java.util.HashMap;
import java.util.Map;

/**
 * Determines Map with all support date format patterns as Key,
 * and objects of DateChecker witch provides method for checking date by this patterns as Value
 */
final class AllDateCheckers {
  static final Map dateCheckersMap = new HashMap<String, DateChecker>() {{
    put("dddd", new DayAs_dddd_Checker());

    put("MM", new MonthAs_MM_Checker());

    put("yyyy", new YearAs_yyyy_Checker());
  }};
}
