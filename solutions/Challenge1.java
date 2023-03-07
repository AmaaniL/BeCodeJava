ublic class Challenge1 {

  /**
   * Assign and print out an example of all the primitive data types in Java:
   * - char
   * - byte
   * - short
   * - int
   * - long
   * - float
   * - double
   * - boolean
   *
   * Goals is to get familiar with these types and make some remarks some oddities
   */

  public static void main(String[] args) {

    char aCharacter = 'b';
    System.out.println(aCharacter);

    char numericalVersion = 123;
    System.out.println(numericalVersion);

    byte aByte = 1;
    System.out.println(aByte);

    byte anotherByte = 127;
    System.out.println(anotherByte);

    short aShort = 130;
    System.out.println(aShort);

    int anInt = 1234455;
    System.out.println(anInt);

    int anotherInt = -123456;
    System.out.println(anotherInt);

    float aFloat = 1.22346f;
    System.out.println(aFloat);

    double aDouble = 1.009;
    System.out.println(aDouble);

    long aLong = 1234L;
    System.out.println(aLong);

    long anotherLong = 123456789;
    System.out.println(anotherLong);

    boolean aBool = false;
    System.out.println(aBool);
  }

  /**
   * Answers:
   * Extra: how come you can just print all of these datatypes? The println method will check the data type and find an appropriate way to deal with it
   * Extra: why are those called primitive data types? They are defined in the java type system and have one purpose — containing pure, simple values of a kind. You cannot define new operations on them
   * Extra: why can't you assign a double to an integer? Because Java is a strongly typed language
   * Very extra: but why can you assign an integer to a char? Because char (characters) is only a representation of a number. See character encoding ect
   * Very extra: Why can't you assign a long to a int? A long is a datatype of 64 bits, while an int is only 32 bits. That means that a long can be too long for an
   * int variable to contain. But an int can always fit in a long.
   */

}