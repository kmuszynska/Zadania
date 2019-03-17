package zadania;

public class Exc5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Liczby podzielne przez 3: " + i);
            }
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Liczby podzielne przez 5: " + i);
            }
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Liczby podzielne przez 3 i 5: " + i);
            }
        }
    }
}
