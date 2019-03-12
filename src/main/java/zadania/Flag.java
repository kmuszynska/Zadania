package zadania;

public class Flag {
    public static void main(String[] args) {
        int i;
        int j = 0;

        System.out.println();
        for (i = 0; i < 15; i++) {
            if (i < 9) {
                if (i % 2 == 0) {
                    System.out.println("* * * * * * ===================================");
                } else {
                    System.out.println(" * * * * *  ===================================");
                }
            } else {
                System.out.println("===============================================");
                    /*do {
                        System.out.print("=");
                        j++;

                    } while (j <= 41);*/
                }

            }
        }
    }



