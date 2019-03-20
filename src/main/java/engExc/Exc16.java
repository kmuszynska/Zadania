package engExc;

public class Exc16 {
    public static void main(String[] args) {
        int[][] tab = new int[4][4];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j <4; ++j) {
                tab[i][j] = (i*4)+j+1;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j =0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Spiral form:");


    }
}
