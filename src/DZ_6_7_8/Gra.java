package DZ_6_7_8;

public class Gra {
    public static void main(String[] args) {

        /* num - число, яке загадав компьютер
        array - гіпотитична послідовність у якій гравець називав би цифри від 1 до 10 */

        int num = 9;
        int sproba = 3;
        int[] array = {3, 7, 9, 2, 1, 5, 8, 4, 6, 0};
        for (int i = 0; i < sproba; i++) {
            if (array[i] == num) {
                System.out.println("Вітаю, Ви виграли" + '\n');
                break;
            } else {
                System.out.println("Нажаль не вірно");
                System.out.println("Залишилось кількість спроб " + (2 - i) + '\n');
            }
        }
    }
}