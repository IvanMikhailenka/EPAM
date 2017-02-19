package task.dev4.statistics;

/**
 * Determines regex constants,
 * which can be used when working with sentences
 */
public interface EnglishSentenceRegex {
  String ALL_EXCEPT_LETTERS_REGEX = "[^a-zA-z]";
  String LETTERS_REGEX = "[a-zA-z]";
  String SPACE = " ";
}
