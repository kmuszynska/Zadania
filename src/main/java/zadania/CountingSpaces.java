package zadania;



import java.util.Scanner;

public class CountingSpaces {
    public static void main(String[] args) {
        System.out.println("Podaj jakiś ciąg znaków");
        Scanner scanner= new Scanner(System.in);
        String someText=scanner.nextLine();

        int spaceCount = 0;
        for (char c : someText.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        System.out.println("liczba spacji w ciągu znaków wynosi: "+spaceCount);
    }
}
