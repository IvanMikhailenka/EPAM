package task.dev7.dateFormatChecker;

import task.dev7.date.dateChecker.DateChecker;

import java.util.List;

/**
 * Provides method for checking input date for compliance with date format patterns
 */
public class SpecificDateDateFormatChecker implements DateFormatChecker {
  private List formatList;
  private Character delimiter;
  private int listIterator = 0;
  private DateChecker dateChecker;

  public SpecificDateDateFormatChecker(List formatList, Character delimiter) {
    this.formatList = formatList;
    this.delimiter = delimiter;
  }

  /**
   * Check input date for compliance with date format patterns
   * @param date - input date
   * @return boolean - true if input date compliance with all date format patterns
   */
  @Override
  public boolean checkDateFormat(String date) {
    listIterator = 0;
    char[] inputDate = date.toCharArray();
    StringBuilder word = new StringBuilder();
    for (int i = 0; i < inputDate.length; i++) {
      if (inputDate[i] != delimiter) {
        word.append(inputDate[i]);
      } else if (inputDate[i] == delimiter) {
        if (!checkDateByFormat(word)) {
          return false;
        }
        word = new StringBuilder();
      }
      if (i == inputDate.length - 1 && !checkDateByFormat(word)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks single part of date for compliance with sing date format pattern
   * @param partOfDate - input part of date
   * @return boolean - true if  part of date is compliance with sing date format pattern
   */
  private boolean checkDateByFormat(StringBuilder partOfDate) {
    dateChecker = (DateChecker) AllDateCheckers.dateCheckersMap.get(formatList.get
        (listIterator));
    if (!dateChecker.checkDate(partOfDate.toString())) {
      return false;
    }
    listIterator++;
    return true;
  }
}
