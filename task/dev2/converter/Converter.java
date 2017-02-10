package task.dev2.converter;

/**
 * Provides method for converting array of strings to String.
 */
public class Converter {

  /**
   * @param strings - input array of strings
   * @return String - converted string
   */
  public String convertStringArrayToString(String[] strings) {
    StringBuilder builder = new StringBuilder();
    for (String string : strings) {
      builder.append(string);
    }
    return builder.toString();
  }
}
