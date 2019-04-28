package dev.tnordquist;

/**
 * CodingBat: We'll say that a positive int divides itself if every digit in the number divides into
 * the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128
 * evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit
 * divides itself.
 */
public class DivideSelf {

  public static boolean dividesSelf(int n) {

    int newN = n;
    int rtDig = newN % 10;
    String strNum = String.valueOf(n);

    for (int i = 0; i < strNum.length(); ++i) {

      if (rtDig == 0 || n % rtDig != 0) {
        return false;
      }
      newN = newN / 10;
      rtDig = newN % 10;
    }
    return true;
  }
}
