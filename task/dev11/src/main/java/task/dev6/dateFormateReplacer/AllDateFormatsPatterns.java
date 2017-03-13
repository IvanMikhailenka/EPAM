package task.dev6.dateFormateReplacer;

import task.dev6.date.dateFormat.dayFormat.*;
import task.dev6.date.dateFormat.eraFormat.EraAs_g;
import task.dev6.date.dateFormat.millisecondsFormat.*;
import task.dev6.date.dateFormat.minutesFormat.MinutesAs_m;
import task.dev6.date.dateFormat.minutesFormat.MinutesAs_mm;
import task.dev6.date.dateFormat.monthFormat.*;
import task.dev6.date.dateFormat.secondsFormat.SecondsAs_s;
import task.dev6.date.dateFormat.secondsFormat.SecondsAs_ss;
import task.dev6.date.dateFormat.timezoneFormat.TimezoneAs_K;
import task.dev6.date.dateFormat.yearFormat.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Determines Map with all support date format patterns as Key,
 * and class pass to classes witch provides method for converting date by this patterns as Value
 */
final class AllDateFormatsPatterns {
  static final Map datePatternsMap = new HashMap<String, Object>(){{
    put("d", DayAs_d.class);
    put("dd", DayAs_dd.class);
    put("ddd", DayAs_ddd.class);
    put("dddd", DayAs_dddd.class);

    put("M", MonthAs_M.class);
    put("MM", MonthAs_MM.class);
    put("MMM", MonthAs_MMM.class);
    put("MMMM", MonthAs_MMMM.class);

    put("y", YearAs_y.class);
    put("yy", YearAs_yy.class);
    put("yyy", YearAs_yyy.class);
    put("yyyy", YearAs_yyyy.class);

    put("g", EraAs_g.class);

    put("f", MillisecondsAs_f.class);
    put("ff", MillisecondsAs_ff.class);
    put("fff", MillisecondsAs_fff.class);
    put("F", MillisecondsAsF.class);
    put("FF", MillisecondsAsFF.class);
    put("FFF", MillisecondsAsFFF.class);

    put("m", MinutesAs_m.class);
    put("mm", MinutesAs_mm.class);

    put("s", SecondsAs_s.class);
    put("ss", SecondsAs_ss.class);

    put("K", TimezoneAs_K.class);
  }};
}
