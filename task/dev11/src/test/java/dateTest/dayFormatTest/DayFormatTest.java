package dateTest.dayFormatTest;

import dateTest.DateFormatTest;
import org.junit.Test;
import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.dayFormat.DayAs_d;
import task.dev6.date.dateFormat.dayFormat.DayAs_dd;
import task.dev6.date.dateFormat.dayFormat.DayAs_ddd;
import task.dev6.date.dateFormat.dayFormat.DayAs_dddd;

import static junit.framework.TestCase.assertEquals;

public class DayFormatTest extends DateFormatTest {
  private DateFormat dateFormat;

  @Test
  public void dayAs_dGetFormatTest() {
    dateFormat = super.initDateFormat(new DayAs_d());
    assertEquals("1", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void dayAs_ddGetFormatTest() {
    dateFormat = super.initDateFormat(new DayAs_dd());
    assertEquals("01", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void dayAs_dddGetFormatTest() {
    dateFormat = super.initDateFormat(new DayAs_ddd());
    assertEquals("Tue", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void dayAs_ddddGetFormatTest() {
    dateFormat = super.initDateFormat(new DayAs_dddd());
    assertEquals("Tuesday", dateFormat.getFormat());
    dateFormat.getFormat();
  }
}
