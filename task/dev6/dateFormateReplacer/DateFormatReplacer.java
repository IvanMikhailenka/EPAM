package task.dev6.dateFormateReplacer;

import task.dev6.date.DateInformation;
import task.dev6.date.dateFormat.DateFormat;
import task.dev6.date.formatFactory.DateFactory;
import task.dev6.date.formatFactory.GlobalDateFormatFactory;

import java.util.Date;

/**
 * Provides method for converting input date by input date format
 */
public class DateFormatReplacer {
  private static final Character ESCAPE_SYMBOL = '\\';
  private StringBuilder resultString = new StringBuilder();
  private DateFactory formatFactory = new GlobalDateFormatFactory();
  private DateFormat dateFormat;
  private DateInformation dateInformation;
  private StringBuilder word;
  private int iterator;

  /**
   * Replace date format patterns by input date in this patterns formats
   * @param inputFormat - date format pattern, e.g. d:MMMM:yyyy mm:ss
   * @param inputDate - date witch need to convert by input patterns
   * @return String - result string witch contains converted date by patterns, words and other symbols
   */
  public String replaceDateFormats(String inputFormat, Date inputDate) {
    dateInformation = new DateInformation(inputDate);
    inputFormat += " ";
    char[] formats = inputFormat.toCharArray();
    word = new StringBuilder();
    for (; iterator < formats.length; iterator++) {
      if (Character.isLetter(formats[iterator])) {
        word.append(formats[iterator]);
      } else if (formats[iterator] == ESCAPE_SYMBOL) {
        addEscapeWord(formats);
      } else {
        addDateInFormat(formats);
      }
    }
    return resultString.toString();
  }

  /**
   * Add word witch start with escape symbol - '\' to result
   * @param formats - array with all symbols
   */
  private void addEscapeWord(char[] formats) {
    while (!Character.isSpaceChar(formats[iterator])) {
      iterator++;
      word.append(formats[iterator]);
    }
    resultString.append(word);
    resultString.append(formats[iterator]);
    word = new StringBuilder();
  }

  /**
   * Add to result converted date by input date format pattern, if such pattern exists
   * @param formats - array with all symbols
   */
  private void addDateInFormat(char[] formats) {
    dateFormat = formatFactory.getDateFormat(word.toString());
    if (!(dateFormat == null)) {
      dateFormat.setInformation(dateInformation);
      resultString.append(dateFormat.getFormat());
    } else {
      resultString.append(word);
    }
    resultString.append(formats[iterator]);
    word = new StringBuilder();
  }
}
