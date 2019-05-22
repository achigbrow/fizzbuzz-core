package edu.cnm.deepdive;

/**
 * Contains one public method to iterate through values 1-100 and determine "Fizz" or "Buzz".
 *
 * <p>This <code>class</code> was built to utilize the fizzBuzzValue <code>class</code> to print a
 * list of values from 1 to 100 as either a {@link String} representation of the value, "Fizz",
 * "Buzz", or "FizzBuzz".</p>
 *
 * @version 1.0.0
 * @author Alana Chigbrow
 */
public class Main {

  private Main() {}

  /**
   * Prints a list of {@link String} representation of integers between 1 and 100 interspaced with
   * "Fizz", "Buzz", and "FizzBuzz" determined by divisibility by 3, 5, or 3 and 5.
   *
   * @param args Command line arguments (ignored)
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }

}

