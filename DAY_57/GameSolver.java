import java.util.HashSet;
import java.util.Scanner;

public class GameSolver {

    public static boolean canWin(int leap, int[] game) {
        HashSet<Integer> visited = new HashSet<>();
        int i = 0;

        while (i < game.length) {
            if (visited.contains(i)) {
                return false;
            }

            visited.add(i);

            if (i + leap >= game.length) {
                return true;
            }

            if (i + 1 < game.length && game[i + 1] == 0) {
                i++;
            } else if (i + leap < game.length && game[i + leap] == 0) {
                i += leap;
            } else if (i - 1 >= 0 && game[i - 1] == 0) {
                i--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int[] game = new int[n];

            for (int j = 0; j < n; j++) {
                game[j] = scanner.nextInt();
            }

            if (canWin(leap, game)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
