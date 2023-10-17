import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą z przedziału [1,9]: ");
        int n = scanner.nextInt();

        scanner.close();

        if ((n > 9) || (n < 1)) {
            System.out.print("Podano liczbę spoza dopuszczalnego przedziału.");
        } else {
            int[][] tabA = new int[n+1][n+1]; // n+1 (zbyt mała tablica)
            for (int i = 0; i <= n; i++) { // i < n -> i <= n (aby tabliczka mnożenia mnożenia była kompletna, i musi być równe podanej przez użytkownika liczbie, n)
                for (int j = 1; j <= n; j++) {
                    tabA[i][j] = i * j;
                    System.out.print(tabA[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }
}
