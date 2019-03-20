package zadania;

import java.util.Scanner;

public class AdditionEx4 {
    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę naturalną");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        String newNumber = Integer.toString(number);
        String newNumber2=newNumber+newNumber;
        String newNumber3=newNumber+newNumber+newNumber;
        Integer number2=Integer.valueOf(newNumber2);
        Integer number3=Integer.valueOf(newNumber3);
        System.out.println(number+"+"+number2+"+"+number3+"="+(number+number2+number3));


    }

}

