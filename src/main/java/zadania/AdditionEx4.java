package zadania;

import java.util.Scanner;

public class AdditionEx4 {
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę naturalną");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int n;
        char s1, s2, s3;


        System.out.printf("%d + %d%d  + %d%d%d\n", number, number, number, number, number, number);
    }

}

