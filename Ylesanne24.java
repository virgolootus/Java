//Virgo

package Java;

import java.util.Scanner;
import java.util.Random;

public class Ylesanne24 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random suvaline = new Random();
            int salajanearv = suvaline.nextInt(100) + 1;
            int pakkumine;
            int pakkumistearv = 0;
            int maxpakkumised = 0;

            System.out.println("Kas soovid arvata lõpmatult või piiratud kordade arvuga?");
            System.out.println("1. Lõpmatult");
            System.out.println("2. Piiratud kordade arvuga");
            int valik = scanner.nextInt();

            if (valik == 1) {
                maxpakkumised = Integer.MAX_VALUE;
            } else if (valik == 2) {
                maxpakkumised = 3;
            } else {
                System.out.println("Sul oli 2 valikut. Mäng lõpetatakse.");
                return;
            }

            while (pakkumistearv < maxpakkumised) {
                System.out.print("Sisesta arv: ");
                pakkumine = scanner.nextInt();
                pakkumistearv++;

                if (pakkumine == salajanearv) {
                    System.out.println("Õige! Arvasid ära arvu " + salajanearv + " ja see võttis sul " + pakkumistearv + " katset.");
                    return;
                } else if (pakkumine < salajanearv) {
                    System.out.println("Pakkumine on liiga väike");
                } else {
                    System.out.println("Pakkumine on liiga suur");
                }
            }
            System.out.println("Arvasid 3 korda valesti ja kaotasid. Number oli:"+ salajanearv);
        }
    }
}
