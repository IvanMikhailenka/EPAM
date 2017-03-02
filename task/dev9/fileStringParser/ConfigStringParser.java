package task9.fileStringParser;

/**
 * Provides method for parsing config file as String
 */
public class ConfigStringParser {
  private int lineIterator;
  private StringBuilder values;

  /**
   * Returns value from input config string by section and key
   * Config String e.g. -
   * <p>
   * [Mail]
   * MAPI=1
   * CMCDLLNAME32=mapi32.dll
   * [MCI Extensions.BAK]
   * 3g2=MPEGVideo
   * <p>
   * where "[Mail]" - section, "MAPI" - key, "1" - value
   *
   * @param config - input config string
   * @param section - input section
   * @param key - input key
   * @return String - value by config and key
   */
  public String getValue(String config, String section, String key) {
    values = new StringBuilder();
    String sectionFormat = "[" + section + "]";
    String keyFormat = key + "=";
    String[] lineArray = config.split("\\n");
    for (lineIterator = 0; lineIterator < lineArray.length; lineIterator++) {
      if (lineArray[lineIterator].equals(sectionFormat)) {
        lineIterator++;
        fiendValues(lineArray, keyFormat);
      }
    }
    return values.toString();
  }

  /**
   * Search value by key
   * @param lineArray - input config as line array
   * @param keyFormat - input key
   */
  private void fiendValues(String[] lineArray, String keyFormat) {
    while (!lineArray[lineIterator].contains("[") || lineIterator == lineArray.length - 1) {
      if (lineArray[lineIterator].startsWith(keyFormat)) {
        values.append(lineArray[lineIterator].replace(keyFormat, ""));
        values.append("\n");
      }
      lineIterator++;
    }
  }
}
