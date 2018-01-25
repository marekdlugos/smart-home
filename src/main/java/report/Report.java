package report;

import java.io.FileNotFoundException;

/**
 * Parent of all the other reports.
 */
public interface Report {
  /**
   * Function that will print the actual report to the file as stated in the requirements.
   * @throws FileNotFoundException
   */
  void print() throws FileNotFoundException;
}
