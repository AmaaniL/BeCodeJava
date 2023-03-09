import java.util.Random;

public class Challenge4 {

  public static void main(String[] args) {
    Integer[] numbers = createArray(20);
    //doDivisions(numbers);
    doProperDivisions(numbers);
  }

  /**
   * Here we catch a general exception and report that something went wrong. We can do better than
   * that, because just reporting that something went wrong is not usefull to anybody.
   * @param numbersToDivide
   */
  private static void doDivisions(Integer[] numbersToDivide) {

    for(int i = 0; i < numbersToDivide.length; i ++) {
      try {
        if (i == 0) {
          Integer result = numbersToDivide[0] / numbersToDivide[0]; //Useless operation, I know but ok
          System.out.println("Dividing " + numbersToDivide[0] + " with itself");
          System.out.println(result);
        }
        else {
          Integer result = numbersToDivide[i] / numbersToDivide[i - 1];
          System.out.println("Dividing " + numbersToDivide[i] +  " with " + numbersToDivide[i-1]);
          System.out.println(result);
        }
      }
      catch (Exception e) {
        System.out.println("something went wrong!");
        e.printStackTrace();
      }
    }
  }

  /**
   * This is a better method, because we catch a specific exception and we report what actually went
   * wrong.
   * @param numbersToDivide
   */
  private static void doProperDivisions(Integer[] numbersToDivide) {
    for (int i = 0; i < numbersToDivide.length; i++) {

      try {
        if (i == 0) {
          System.out.println("Dividing " + numbersToDivide[0] + " with itself");
          System.out.println("1");
        }
        else {
          Integer result =  numbersToDivide[i] / numbersToDivide[i - 1];
          System.out.println("Dividing " + numbersToDivide[i] +  " with " + numbersToDivide[i-1]);
          System.out.println(result);
        }
      }
      catch (ArithmeticException arithmeticException) {
        System.out.println("Operation not allowed: ");
        System.out.println(arithmeticException.getMessage());
      }
    }
  }

  private static Integer[] createArray(int upperboundArray) {
    Random rand = new Random();

    Integer[] numbers = new Integer[upperboundArray];

    for(int i = 0; i < upperboundArray; i++) {
      numbers[i] = rand.nextInt(upperboundArray);
    }

    return numbers;
  }

}