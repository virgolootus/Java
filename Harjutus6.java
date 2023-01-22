//Virgo Lootus


package Java;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Harjutus6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbrid = new ArrayList<>();
        addNumbers(numbrid);
        int summa = getSum(numbrid);
        double keskmine = getAverage(numbrid, summa);
        saveToFile(numbrid, summa, keskmine);
    }

    public static void addNumbers(ArrayList<Integer> numbrid) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Sisesta täisarv (tyhjaks j2tmine lõpetab sisestuse): ");
                String sisend = scanner.nextLine();
                if (sisend.isEmpty()) {
                    break;
                }
                int number = Integer.parseInt(sisend);
                numbrid.add(number);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static int getSum(ArrayList<Integer> numbrid) {
        int summa = 0;
        for (int number : numbrid) {
            summa += number;
        }
        return summa;
    }

    public static double getAverage(ArrayList<Integer> numbrid, int summa) {
        return (double) summa / numbrid.size();
    }

    public static void saveToFile(ArrayList<Integer> numbrid, int summa, double keskmine) {
        try {
            FileWriter fail = new FileWriter("numbrid.txt");
            BufferedWriter bw = new BufferedWriter(fail);
            for (int number : numbrid) {
                bw.write(number + " ");
            }
            bw.newLine();
            bw.write("Summa: " + summa);
            bw.newLine();
            bw.write("Keskmine: " + keskmine);
            bw.close();
            System.out.println("Andmed salvestatud faili numbrid.txt");
        } catch (IOException e) {
            System.out.println("Tekkis viga faili kirjutamisel");
        }
    }
}
