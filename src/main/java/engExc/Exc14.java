package engExc;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        System.out.println("Loteria losuje liczbę dwucyfrową");
        Random random = new Random();
        Integer liczb1 = random.nextInt(100) ;


        List<Integer> lottery = new LinkedList();
        lottery.add(liczb1);

        System.out.println(liczb1);
        System.out.println("Podaj swoją liczbę dwucyfrową");
        Scanner scanner = new Scanner(System.in);
        Integer liczba2= scanner.nextInt();
        List<Integer>mojeLiczby = new LinkedList<Integer>();
        mojeLiczby.add(liczba2);

        if (liczb1==liczba2){
            System.out.println("Wygrałes 10 000$");
        }



    }
}
