package DZ_9_10_11;

import java.util.Arrays;

public class Lottery {

    public static void main(String[] args) {
        int[] lotteryOrganizer = {6, 9, 4, 8, 2, 4, 1};
        int[] lotteryPlayer = {2, 0, 5, 6, 3, 7, 9};

        Arrays.sort(lotteryOrganizer);
        Arrays.sort(lotteryPlayer);

        System.out.println(Arrays.toString(lotteryOrganizer) + '\n' + Arrays.toString(lotteryPlayer) + '\n');

        int match = 0;

        for (int i = 0; i < lotteryOrganizer.length && i < lotteryPlayer.length; i++) {
            if (lotteryOrganizer[i] == lotteryPlayer[i]) {
                match += 1;
            }
        }
        System.out.println("Кількість збігів: " + match);
    }
}