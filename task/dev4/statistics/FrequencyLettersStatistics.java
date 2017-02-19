package task.dev4.statistics;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides methods for calculate frequency of occurrence of a certain number of letters
 */
public class FrequencyLettersStatistics implements EnglishSentenceRegex {
  private Map<String, Float> frequenciesLetters = new HashMap<>();
  private Map<String, Float> frequencyLetters = new HashMap<>();

  /**
   * Calculate frequency for input sentence
   * @param sentence - input sentence
   * @param amountLetters - amount on which word break and calculate frequency
   */
  public void calculateFrequencyLetters(String sentence, int amountLetters) {
    frequencyLetters = countFrequenciesLetters(sentence, amountLetters);
    int sumOfFrequencies = getTotalFrequencies();
    for (Map.Entry<String, Float> entry : frequencyLetters.entrySet()) {
      entry.setValue(entry.getValue() / sumOfFrequencies);
    }
  }

  /**
   * Calculate frequencies for each amount of letters
   * @param sentence - input sentence
   * @param amountLetters - amount on which word break and calculate frequencies
   * @return Map - Key : piece of world, Value : it's frequencies of occurrence
   */
  private Map<String, Float> countFrequenciesLetters(String sentence, int amountLetters) {
    String[] words = sentence.split(SPACE);
    for (String word : words) {
      word = word.replaceAll(ALL_EXCEPT_LETTERS_REGEX, "");
      for (int i = 0; i < word.length(); i++) {
        int counter = 1;
        if (!(i + amountLetters <= word.length())) {
          break;
        }
        String piece = word.substring(i, i + amountLetters);
        fillFrequenciesLettersMap(piece, counter);
      }
    }
    return frequenciesLetters;
  }

  /**
   * Fills frequenciesLetterMap by Key - piece of word, Value - it's frequencies of occurrence
   * @param piece - piece of word
   * @param counter - it's frequencies of occurrence
   */
  private void fillFrequenciesLettersMap(String piece, float counter) {
    if (frequenciesLetters.containsKey(piece)) {
      counter = frequenciesLetters.get(piece) + 1;
      frequenciesLetters.put(piece, counter);
    } else {
      frequenciesLetters.put(piece, counter);
    }
  }

  /**
   * Calculate sum of all frequencies
   * @return int - sum of all frequencies
   */
  private int getTotalFrequencies() {
    int count = 0;
    for (Map.Entry<String, Float> entry : frequenciesLetters.entrySet()) {
      count += entry.getValue();
    }
    return count;
  }

  public Map<String, Float> getFrequencyLetters() {
    return frequencyLetters;
  }
}
