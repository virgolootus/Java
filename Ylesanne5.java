//Virgo

package Java;

import java.util.Scanner;

public class Ylesanne5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("sisesta esimene rööpselt ühendatud takisti: ");
            double takisti1 = scanner.nextDouble();
            System.out.print("sisesta teine rööpselt ühendatud takisti: ");
            double takisti2 = scanner.nextDouble();
            double rooptakistus = (takisti1 * takisti2) / (takisti2 + takisti2);
            System.out.print("sisesta esimene jadamisi ühendatud takisti: ");
            double takisti3 = scanner.nextDouble();
            System.out.print("sisesta teine jadamisi ühendatud takisti: ");
            double takisti4 = scanner.nextDouble();
            double seriesResistance = takisti3 + takisti4;
            double kogutakistus = rooptakistus + seriesResistance;
            System.out.println("takistite kogutakistus on " + kogutakistus + " ohmi.");
        }
    }
}
