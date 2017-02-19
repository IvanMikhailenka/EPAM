package task.dev4.statistics;

/**
 * Determines regex constants,
 * which can be used when working with sentences
 */
final class EnglishSentenceRegex {
  static final String ALL_EXCEPT_LETTERS_REGEX = "[^a-zA-z]";
  static final String LETTERS_REGEX = "[a-zA-z]";
  static final String SPACE = " ";

  private EnglishSentenceRegex() {
  }
}
