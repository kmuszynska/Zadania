package zadania;

import java.util.Scanner;

public class Hexagon {

    public static void main(String[] args) {
        System.out.println("Podaj długość boku");
        Scanner scanner = new Scanner(System.in);
        double alfa = scanner.nextDouble();
        pole(alfa);
        circuit(alfa);
        longerDiagonal(alfa);
        shorterDiagonal(alfa);
        radius(alfa);


    }

    public static void pole(double alfa) {
        double pole = (3 * (Math.pow(alfa, 2) * Math.sqrt(3))) / 2;
        System.out.format("Pole tego sześciokąta foremnego wynosi: " + "%.2f%n", pole);
    }

    public static void circuit(double alfa) {
        double circuit = 6 * alfa;
        System.out.format("Obwód tego sześciokąta foremnego wynosi: " + "%.2f%n", circuit);
    }
    public static void longerDiagonal (double alfa){
        double longerDiagonal = 2*alfa;
        System.out.format("Dłuższa przekątna tego sześciokąta foremengo to dwie długości jego boku i wynosi: "
                +"%.2f%n",longerDiagonal);
    }
    public static void shorterDiagonal (double alfa){
        double shorterDiagonal = alfa*Math.cbrt(3);
        System.out.format("Krótsza krawędź tego sześciokąta foremnego wynosi: "+"%.2f%n",shorterDiagonal);
    }
    public static void radius (double alfa){
        double radius = (alfa*Math.cbrt(3))/2;
        System.out.format("Długość promienia okręgu wpisanego w ten sześciokąt foremny wynosi: "+"%.2f%n",radius);
    }
}
