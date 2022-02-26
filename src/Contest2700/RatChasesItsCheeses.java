package Contest2700;

import java.util.Scanner;

public class RatChasesItsCheeses {
    static boolean isPossible;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String p;
        char[][] ch = new char[n][m];
        for ( int i = 0; i < n; i++){
            p = sc.nextLine();
            ch[i] = p.toCharArray();
        }
        checkIfCheesse( ch, n, m, 0, 0);
    }

    private static void checkIfCheesse(char[][] ch, int n, int m, int i, int j) {
        int[][] visited = new int[n][m];
        if ( i < 0 || j < 0 || i > n - 1 || j > m - 1 || visited[i][j] == 1 || ch[i][j] == 'X'){
            return;
        }
        visited[i][j] = 1;

        if (i == m - 1 && j == n - 1) {
            visited[m - 1][n - 1] = 1;
            for (int k = 0; k < m; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(visited[k][l] + " ");
                }
                System.out.println();
            }
            isPossible = true;
            return;
        }

        ch[i][j] = 1;

        checkIfCheesse(ch, n, m ,i - 1, j);
        checkIfCheesse(ch, n, m, i + 1, j);
        checkIfCheesse(ch, n, m, i, j - 1);
        checkIfCheesse(ch, n, m, i, j + 1);

        ch[i][j] = 0;
    }
}
