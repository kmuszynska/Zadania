package engExc;

import java.util.Scanner;

public class Exc13 {
    public static void main(String[] args) {
        System.out.println("podaj pierwszą współrzędna na osi x");
        Scanner scanner= new Scanner(System.in);
        int x1= scanner.nextInt();
        System.out.println("Podaj pierwszą współrzędna na osi Y");
        int y1=scanner.nextInt();
        System.out.println("Podaj drugą współrzedna na osi X");
        int x2=scanner.nextInt();
        System.out.println("Podaj drugą współrzędną na osi Y");
        int y2=scanner.nextInt();
        double distance;
        distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        System.out.println("odległość między tymi punktami wynosi: "+distance);
    }
}
