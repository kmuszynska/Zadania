package engExc;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        System.out.println("Loteria losuje liczbę dwucyfrową");
        Random random = new Random();
        Integer randomLiczba = random.nextInt(100);
        String randomLiczbaString = Integer.toString(randomLiczba);

        if (randomLiczbaString.length() == 1) {
            randomLiczbaString = "0" + randomLiczbaString;
        }
     //   System.out.println(randomLiczbaString);


        System.out.println("Podaj swoją liczbę dwucyfrową");
        Scanner scanner = new Scanner(System.in);
        Integer uczestnikLiczba = scanner.nextInt();
        String uczestnikLiczbaString = Integer.toString(uczestnikLiczba);

        if (uczestnikLiczbaString.length() == 1) {
            uczestnikLiczbaString = "0" + uczestnikLiczbaString;
        }

        if (randomLiczbaString.equals(uczestnikLiczbaString)) {
            System.out.println("Wygrałes 10 000$");
        } else if (randomLiczbaString.charAt(0) == uczestnikLiczbaString.charAt(1) && randomLiczbaString.charAt(1) == uczestnikLiczbaString.charAt(0)) {
            System.out.println("Wygrałeś 3 000");
        } else if (randomLiczbaString.contains(uczestnikLiczbaString.substring(0,1 ))||
                randomLiczbaString.contains(uczestnikLiczbaString.substring(1,0 ))) {
            System.out.println("Wygrałeś 1 000");
        } else {
            System.out.println("Spróbuj innym razem");


        }
    }
}
