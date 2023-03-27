package DZ_9_10_11;

import java.util.Random;
import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random randomizer = new Random();

        System.out.print("Input number of lines 'M': ");
        int m = in.nextInt();

        System.out.print("Input number of columns 'N': ");
        int n = in.nextInt();

        System.out.println("\n" + "Input matrix M x N: ");
        int[][] inputMatrix = new int[m][n];
        int[][] transposeMatrix = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                inputMatrix[i][j] = randomizer.nextInt(10);
                transposeMatrix[j][i] = inputMatrix[i][j];
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n" + "Transpose matrix N x M: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}