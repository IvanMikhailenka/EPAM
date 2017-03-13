package dateTest.monthFormatTest;

import dateTest.DateFormatTest;
import org.junit.Test;
import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.dateFormat.monthFormat.MonthAs_M;
import task.dev6.date.dateFormat.monthFormat.MonthAs_MM;
import task.dev6.date.dateFormat.monthFormat.MonthAs_MMM;
import task.dev6.date.dateFormat.monthFormat.MonthAs_MMMM;

import static junit.framework.TestCase.assertEquals;


public class MontFormatTest extends DateFormatTest {
  private DateFormat dateFormat;

  @Test
  public void monthAsMGetFormatTest() {
    dateFormat = super.initDateFormat(new MonthAs_M());
    assertEquals("3", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void monthAsMMGetFormatTest() {
    dateFormat = super.initDateFormat(new MonthAs_MM());
    assertEquals("03", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void monthAsMMMGetFormatTest() {
    dateFormat = super.initDateFormat(new MonthAs_MMM());
    assertEquals("Mar", dateFormat.getFormat());
    dateFormat.getFormat();
  }

  @Test
  public void monthAsMMMMGetFormatTest() {
    dateFormat = super.initDateFormat(new MonthAs_MMMM());
    assertEquals("March", dateFormat.getFormat());
    dateFormat.getFormat();
  }
}
