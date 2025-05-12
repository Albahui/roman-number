package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {
  private static final TreeMap<Integer, String> romanMap = new TreeMap<>();
  static {

    romanMap.put(1, "I");
}
  public static String convert(int number){

      if (number <= 0 || number > 3) {
          throw new IllegalArgumentException("The number must be between 1 and 3");
      }
      int closest = romanMap.floorKey(number);
      if (number == closest) {
          return romanMap.get(number);
      }
      return romanMap.get(closest) + convert(number - closest);
  }
  
}