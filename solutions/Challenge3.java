import java.util.Random;

public class Challenge3 {

  public static void main(String[] args) {
    createArray(50, 25);
  }

  private static void createArray() {
    Random rand = new Random();

    int[] numbers = new int[100];

    for(int i = 0; i < 100; i++) {
      numbers[i] = rand.nextInt(100);
    }

    for(int number : numbers) {
     if (number < 10) {
       System.out.println(number);
     }
    }
  }

  private static void createArray(int upperboundArray, int upperprintvalue) {
    Random rand = new Random();

    int[] numbers = new int[upperboundArray];

    for(int i = 0; i < upperboundArray; i++) {
      numbers[i] = rand.nextInt(upperboundArray);
    }

    for(int number : numbers) {
      if (number < upperprintvalue) {
        System.out.println(number);
      }
    }
  }

}