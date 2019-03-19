package engExc;

import java.util.Scanner;

public class Exc15 {
    public static void main(String[] args) {
        System.out.println("Podaj rok, aby sprawdzić horoskop chiński");
        Scanner scanner= new Scanner(System.in);
        int year = scanner.nextInt();
        String[] zodiak = {"małpa","kogut","pies","świnia","szczur","wół", "tygrys","królik","smok", "wąż", "koń", "owca"};

        System.out.println(zodiak[year % 12]);

    }

}
