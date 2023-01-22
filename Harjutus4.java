//Virgo Lootus

package Java;

import java.util.Scanner;

public class Harjutus4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Sisesta tekst: ");
            String tekst = scanner.nextLine();
            String capstekst = tekst.toUpperCase();
            System.out.println("Tekst capsis: " + capstekst);
            int chararv = tekst.length();
            System.out.println("Teksti märkide arv: " + chararv);
            String[] sõnad = tekst.split(" ");
            int sõnaarv = sõnad.length;
            System.out.println("Teksti sõnade arv: " + sõnaarv);
            System.out.printf("Sisestatud lause esimene sõna: %s", sõnad[0]);
        }
    }
}
