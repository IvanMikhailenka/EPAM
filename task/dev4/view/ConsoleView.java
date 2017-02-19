package task.dev4.view;

import task.dev4.reader.ConsoleReader;
import task.dev4.reader.Reader;
import task.dev4.statistics.FrequencyLettersStatistics;
import task.dev4.statistics.WordsGreaterLengthStatistics;

import java.io.IOException;
import java.util.Map;

/**
 * Provides method for conducting a dialogue with user
 */
public class ConsoleView {
  private static final int MIN_STRING_AMOUNT = 3;
  private static final int MAX_WORD_LENGTH = 5;
  private static final int AMOUNT_LETTERS = 2;
  private static final String YES = "Y";
  private Reader reader = new ConsoleReader();
  private FrequencyLettersStatistics frequencyStatistics = new FrequencyLettersStatistics();
  private WordsGreaterLengthStatistics wordsStatistics = new WordsGreaterLengthStatistics();

  /**
   * Conducts a dialogue with user
   * @throws IOException - throws if there are problems with input
   */
  public void consoleDialog() throws IOException {
    for (int i = 0; i < MIN_STRING_AMOUNT; i++) {
      inputNewSentence();
    }
    while (askClient().equalsIgnoreCase(YES)) {
      String newSentence = inputNewSentence();
      recalculateAllStatistics(newSentence);
    }
    showAllStatistics();
  }

  /**
   * Writes question to console and return answer
   * @return String - answer
   * @throws IOException - throws if problems with input data
   */
  private String askClient() throws IOException {
    System.out.println("Do you want to input sentence? Y/N");
    return reader.read();
  }

  /**
   * Asks user to enter a new sentence and return it
   * @return String - new sentence
   * @throws IOException - throws if problems with input data
   */
  private String inputNewSentence() throws IOException {
    System.out.println("Please input sentence");
    return reader.read();
  }

  /**
   * Recalculate all statistics for new sentence
   * @param sentence - input sentence
   */
  private void recalculateAllStatistics(String sentence) {
    wordsStatistics.calculateAmountWordsGreaterLength(sentence, MAX_WORD_LENGTH);
    frequencyStatistics.calculateFrequencyLetters(sentence, AMOUNT_LETTERS);
  }

  /**
   * Show all statistics on console
   */
  private void showAllStatistics() {
    System.out.println("Words greater length: " + wordsStatistics.getAmountWordsGreaterLength());
    System.out.println("Frequency");
    for (Map.Entry<String, Float> entry : frequencyStatistics.getFrequencyLetters().entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
