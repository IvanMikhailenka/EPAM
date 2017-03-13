package dateTest;

import task.dev6.date.DateInformation;
import task.dev6.date.dateFormat.DateFormat;

import java.util.Calendar;


public class DateFormatTest {

  protected DateFormat initDateFormat(DateFormat dateFormat) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2016, 02, 1);
    dateFormat.setInformation(new DateInformation(calendar.getTime()));
    return dateFormat;
  }
}
