package engExc;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        System.out.println("Podaj prędkość początkową");
        Scanner scanner = new Scanner(System.in);
        double v0= scanner.nextDouble();
        System.out.println("Podaj prędkość końcową");
        double v1=scanner.nextDouble();
        System.out.println("Podaj przedział czasu w sekundach ");
        double t = scanner.nextDouble();
        double a;
        a=(v1-v0)/t;
        System.out.println("średnie przyspieszenie wynosi "+ Math.abs(a)+" m/s2");
    }
}
