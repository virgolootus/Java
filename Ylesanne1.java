//Virgo

package Java;

import java.util.Scanner;

public class Ylesanne1 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("sisesta esimene arv: ");
      int number1 = scanner.nextInt();
      System.out.print("sisesta teine arv: ");
      int number2 = scanner.nextInt();
      int sum = number1 + number2;
      System.out.println("arvude " + number1 + " ja " + number2 + " summa on " + sum);
    }
  }
}