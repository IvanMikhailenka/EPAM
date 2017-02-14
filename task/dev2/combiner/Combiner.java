package task.dev2.combiner;

/**
 * Provides method for combine array of strings to String.
 */
public class Combiner {

  /**
   * @param strings - input array of strings
   * @return String - converted string
   */
  public String combineStringArrayToString(String[] strings) {
    StringBuilder builder = new StringBuilder();
    for (String string : strings) {
      builder.append(string);
    }
    return builder.toString();
  }

}
