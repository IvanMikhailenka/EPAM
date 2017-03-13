package dateFormatReplacerTest;

import org.junit.Before;
import org.junit.Test;
import task.dev6.dateFormateReplacer.DateFormatReplacer;

import java.util.Calendar;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class DateFormatReplacerTest {
  private Date date;

  @Before
  public void init() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2016, 02, 1);
    date = calendar.getTime();
  }

  @Test
  public void replaceDateFormatsTest() throws IllegalAccessException, InstantiationException {
    DateFormatReplacer replacer = new DateFormatReplacer();
    assertEquals("1:March:2016 ", replacer.replaceDateFormats("d:MMMM:yyyy", date));
  }

  @Test
  public void replaceDateUnsupportedFormatsTest() throws IllegalAccessException, InstantiationException {
    DateFormatReplacer replacer = new DateFormatReplacer();
    assertEquals("1:March:yyyyd ", replacer.replaceDateFormats("d:MMMM:yyyyd", date));
  }
}
