package DZ_9_10_11;

import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {
        int[] teamAge1 = {19, 28, 32, 24, 27, 28, 18, 20, 21, 20, 35, 38, 33, 31, 30, 34, 18, 21, 26, 29, 23, 20, 33, 38, 40};
        int[] teamAge2 = {28, 20, 37, 25, 23, 39, 19, 28, 25, 26, 36, 34, 38, 40, 25, 37, 23, 25, 29, 30, 32, 25, 35, 32, 36};
        int sum1 = 0;
        int sum2 = 0;

        System.out.println("Вік гравців команди 1: " + Arrays.toString(teamAge1) + '\n');
        System.out.println("Вік гравців команди 2: " + Arrays.toString(teamAge2) + '\n');

        for (int i : teamAge1) {
            sum1 += i;
        }
        System.out.println("Середній вік гравців команди 1: " + sum1 / teamAge1.length + '\n');

        for (int j : teamAge2) {
            sum2 += j;
        }
        System.out.println("Середній вік гравців команди 2: " + sum2 / teamAge2.length + '\n');
    }
}