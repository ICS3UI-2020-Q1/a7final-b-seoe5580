/**
 * This program will return true if the sum of the digits in a number is divisable otherwise it will return false
 * @author Eric Seo
 */
public class Main {

  // creates a method by using boolean return type
  public static boolean nivenNumber(int num){
    // creates variable for calculations
    int sum = 0;
    int originalNumber = num;
    int remainder = 0;
    // using the while loop does the calculations
    while(num >= 1){
      remainder = num % 10;
      num = num / 10;
      sum = sum + remainder;
    }
    // using the if statment compares the originalnumber and the added digits and if the remainder is 0 it will return true otherwise it will return false
    if(originalNumber % sum == 0){
      return true;
    }else{
      return false;
    }
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a boolean variable so it is printoutable and it will print out true or false based off this nivenNumber
    boolean answer = nivenNumber(18);
    // prints out the answer
    System.out.println(answer);
  }
}
