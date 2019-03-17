package zadania;

import java.util.Scanner;

public class Exc6Seconds {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę sekund");
        Scanner scanner = new Scanner(System.in);
        int secondsTotal = scanner.nextInt();
        if (secondsTotal <= 86400) {
            int seconds = secondsTotal % 60;//calosc sekund na koncowke sekund
            int minutes = (secondsTotal % 3600) / 60; //czyli godziny i przez 60 na minuty
            int hours = secondsTotal / 3600;

            String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println(time);
        } else {
            throw new IllegalArgumentException("Doba liczy 86 400 sekund!");
        }


    }
}
