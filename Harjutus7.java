//Virgo Lootus

package Java;

import java.util.Scanner;

public class Harjutus7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean sisendtehtud = false;
            while (!sisendtehtud) {
                try {
                    System.out.println("Sisesta esimene arv: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Sisesta teine arv: ");
                    int num2 = scanner.nextInt();
                    int tulemus = num1 + num2;
                    System.out.println("Aritmeetiline tehe: " + num1 + " + " + num2 + " = " + tulemus);
                    sisendtehtud = true;
                } catch (Exception e) {
                    System.out.println("Palun sisesta ainult arvud.");
                    scanner.nextLine();
                }
            }
        }
    }
}

