package engExc;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        final double c = 4268;
        System.out.println("Podaj masę wody w kg");
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        System.out.println("Podaj początkową temperaturę wody w Kelwinach");
        double t0 = scanner.nextDouble();
        System.out.println("Podaj temperaturę końcową wody w Kelwinach");
        double t1 = scanner.nextDouble();
        double energy;
        energy=c*m*(t1-t0);
        System.out.println("Energia potrzebna do ogrzania "+m+" kg wody wynosi: "+energy+" dżuli.");
    }
}
