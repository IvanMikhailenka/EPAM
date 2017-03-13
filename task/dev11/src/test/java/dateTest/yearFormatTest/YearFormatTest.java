package dateTest.yearFormatTest;

import dateTest.DateFormatTest;
import org.junit.Test;
import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.yearFormat.YearAs_y;
import task.dev6.date.dateFormat.yearFormat.YearAs_yy;
import task.dev6.date.dateFormat.yearFormat.YearAs_yyy;
import task.dev6.date.dateFormat.yearFormat.YearAs_yyyy;

import static junit.framework.TestCase.assertEquals;


public class YearFormatTest extends DateFormatTest {
  private DateFormat dateFormat;

  @Test
  public void yearAs_yGetFormatTest() {
    dateFormat = super.initDateFormat(new YearAs_y());
    assertEquals("16", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void yearAs_yyGetFormatTest() {
    dateFormat = super.initDateFormat(new YearAs_yy());
    assertEquals("16", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void yearAs_yyyGetFormatTest() {
    dateFormat = super.initDateFormat(new YearAs_yyy());
    assertEquals("016", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void yearAs_yyyyGetFormatTest() {
    dateFormat = super.initDateFormat(new YearAs_yyyy());
    assertEquals("2016", dateFormat.getFormat());
    dateFormat.getFormat();
  }
}
