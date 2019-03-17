package zadania;

import java.util.Scanner;

//TODO jakos zmienic to ustawienie liczb w wierszach
public class Exc7Tab {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę z zakresu od 1 do 10");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int value = 1;
        int nums[][] = new int[number + 1][number + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j]=i;
                nums[j][i] = i;


            }


        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
