package task.dev3.view;

import task.dev3.reader.Reader;
import task.dev3.service.averageAge.AverageAge;
import task.dev3.service.mostPopularName.MostPopularName;
import task.dev3.service.namesakes.Namesakes;
import task.dev3.service.oldestEntity.OldestEntity;

import java.io.IOException;

/**
 * Provides methods to show all options
 */
public class AllOptionsConsoleView {
  private static final String YES = "y";
  private Reader reader;
  private AverageAge averageAge;
  private MostPopularName mostPopularName;
  private Namesakes namesakes;
  private OldestEntity oldestEntity;

  /**
   * Ask user that he wont to show all information and do it
   * @throws IOException - throws if problems with input data
   */
  public void showAllOptionsConsoleDialog() throws IOException {
    System.out.println("Do you want show all information? Y/N");
    if (reader.read().equalsIgnoreCase(YES)) {
      System.out.println("Average age " + averageAge.getAverageAge());
      System.out.println("Oldest user " + oldestEntity.getOldest());
      System.out.println("Most popular woman name " + mostPopularName.getMostPopularName());
      System.out.println("Namesakes " + namesakes.getNamesakes());
    }
  }

  public Reader getReader() {
    return reader;
  }

  public void setReader(Reader reader) {
    this.reader = reader;
  }

  public AverageAge getAverageAge() {
    return averageAge;
  }

  public void setAverageAge(AverageAge averageAge) {
    this.averageAge = averageAge;
  }

  public MostPopularName getMostPopularName() {
    return mostPopularName;
  }

  public void setMostPopularName(MostPopularName mostPopularName) {
    this.mostPopularName = mostPopularName;
  }

  public Namesakes getNamesakes() {
    return namesakes;
  }

  public void setNamesakes(Namesakes namesakes) {
    this.namesakes = namesakes;
  }

  public OldestEntity getOldestEntity() {
    return oldestEntity;
  }

  public void setOldestEntity(OldestEntity oldestEntity) {
    this.oldestEntity = oldestEntity;
  }
}
