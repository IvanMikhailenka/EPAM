package task.dev4.statistics;

/**
 * Provides method for calculating amount of words greater some length
 */
public class WordsGreaterLengthStatistics {
  private int amountWordsGreaterLength = 0;

  /**
   * Calculate amount of words, from input sentence, which greater the length
   * @param sentence - input sentence
   * @param length - min length of words which need to calculate
   */
  public void calculateAmountWordsGreaterLength(String sentence, int length) {
    String[] words = sentence.split(EnglishSentenceRegex.SPACE);
    for (String word : words) {
      word = word.replaceAll(EnglishSentenceRegex.ALL_EXCEPT_LETTERS_REGEX, "");
      if (word.length() > length) {
        amountWordsGreaterLength++;
      }
    }
  }

  public int getAmountWordsGreaterLength() {
    return amountWordsGreaterLength;
  }
}
