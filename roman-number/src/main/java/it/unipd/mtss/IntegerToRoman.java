package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {
  private static final TreeMap<Integer, String> romanMap = new TreeMap<>();
  static {

    romanMap.put(1, "I");
    romanMap.put(5, "V");
    romanMap.put(4, "IV");
    romanMap.put(9, "IX");
    romanMap.put(10, "X");
    romanMap.put(20, "XX");
  
}
  public static String convert(int number){

      if (number <= 0 || number > 20) {
          throw new IllegalArgumentException("The number must be between 1 and 20");
      }
      int closest = romanMap.floorKey(number);
      if (number == closest) {
          return romanMap.get(number);
      }
      return romanMap.get(closest) + convert(number - closest);
  }
  
}
