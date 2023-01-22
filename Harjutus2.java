//Virgo Lootus

package Java;

class Harjutus2 {

    public static void main(String[] args) {
        double tollid = 14;
        double meters = tollidToMeters(tollid);
        System.out.println("Teisendame " + tollid + " tolli meetriteks: " + meters + " m");

        double a = 7;
        double b = 4;
        double ellipseArea = ellipseArea(a, b);
        System.out.println("Ellipsi pindala on: " + ellipseArea + " ruutmeetrit.");

        int minutid = 98;
        tundideksJaMinutiteks(minutid);

        double distants1 = 15; //kilometres
        double aeg1 = 0.5; //hours
        double kiirus1 = leiaKiirus(distants1, aeg1);
        System.out.println("Esimene sportlane sai kiiruseks " + kiirus1 + " km/h");

        double distants2 = 15; //kilometres
        double aeg2 = 0.7; //hours
        double kiirus2 = leiaKiirus(distants2, aeg2);
        System.out.println("Teine sportlane sai kiiruseks " + kiirus2 + " km/h");

        double vahe = leiaKiirusteVahe(kiirus1, kiirus2);
        System.out.println("Nende kiiruste vahe on " + vahe + " km/h");
    }

    // Meetod tollide teisendamiseks meetriteks
    public static double tollidToMeters(double tollid) {
        return 0.3048 * tollid;
    }

    // Meetod ellipsi pindala leidmiseks
    public static double ellipseArea(double a, double b) {
        return Math.PI * a * b;
    }

    // Meetod minutite teisendamiseks tundideks ja minutiteks
    public static void tundideksJaMinutiteks(int minutid) {
        int tunde = minutid / 60;
        int minutidJääk = minutid % 60;
        System.out.println(minutid + " minutit on " + tunde + " tundi ja " + minutidJääk + " minutit.");
    }

    // Meetod sportlase kiiruse leidmiseks
    public static double leiaKiirus(double distants, double aeg) {
        return distants / aeg;
    }

    // Meetod sportlaste kiiruste vahe leidmiseks
    public static double leiaKiirusteVahe(double kiirus1, double kiirus2) {
        return Math.abs(kiirus1 - kiirus2);
    }
}

