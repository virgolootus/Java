//Virgo Lootus

package Java;

import java.util.Scanner;

public class Harjutus5 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            division();
        }
    }

    public static void division() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Sisesta jagatav: ");
            int dividend = scanner.nextInt();
            System.out.println("Sisesta jagaja: ");
            int divisor = scanner.nextInt();

            if (dividend >= 0 && divisor > 0) {
                double quotient = (double) dividend / divisor;
                System.out.println("Jagatis: " + quotient);
            } else {
                System.out.println("Sisestatud arvud ei sobi jagamistehteks. Jagatav peab olema positiivne või null ja jagaja peab olema positiivne.");
            }
        }
    }
}

