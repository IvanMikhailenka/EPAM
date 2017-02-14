package igorhmm.currenttime;

/**
 * Entry point to software to get current time,
 * No input parameters from CL are used
 */
public class EntryPoint {
  private static final String TIME_FORMAT = "HH:mm";

  /** Starts execution of the program */
  public static void main(String[] args) {
    System.out.println("Current time is " + CurrentTime.getTime(TIME_FORMAT));
  }
}