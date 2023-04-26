package DZ_15_upd;

import java.util.Scanner;

import static DZ_15_upd.DrinksMachine.*;

public class Drinks {

    public static void main(String[] args) {

        String question;
        DrinkSwitcher drinkSwitcher = new DrinkSwitcher();

        Scanner scanner = new Scanner(System.in);
        question = "Y";

        System.out.print("\033[4m" + "ВІТАЄМО ВАС У НАШОМУ ОНЛАЙН-БАРІ =)" + "\033[0m" + '\n');
        System.out.print("Ознайомтесь з нашою барною картою:" + '\n' + TEA + " " + COFFEE + " " +
                LEMONADE + " " + MOKHITO + " " + MINERALWATER + " " + COCACOLA + '\n');
        System.out.println();

        for (int q = 1; question.equals("Y"); q++) {
            if (q == 1) {
                System.out.print("Бажаєте щось замовити? (Y/N): ");
                question = scanner.nextLine().toUpperCase();

                if (question.equals("Y")) {

                    DrinksMachine drink = DrinkSwitcher.userDrinkChoice();
                    int quantity = DrinkSwitcher.userNumChoice();
                    drinkSwitcher.drinkSwitcher(drink, quantity);

                } else if (question.equals("N")) {
                    return;

                } else {
                    System.out.println("Некоректне введення, спробуйте будь ласка ще раз" + '\n');
                    question = "Y";
                    q = 0;
                }
            }

            if (q > 1) {
                System.out.print("Бажаєте замовити щось ще? (Y/N): ");
                question = scanner.nextLine().toUpperCase();

                if (question.equals("Y")) {

                    DrinksMachine drink = DrinkSwitcher.userDrinkChoice();
                    int quantity = DrinkSwitcher.userNumChoice();
                    drinkSwitcher.drinkSwitcher(drink, quantity);

                } else if (question.equals("N")) {
                    drinkSwitcher.totalCost();
                    return;
                } else {
                    System.out.println("Некоректне введення, спробуйте будь ласка ще раз" + '\n');
                    question = "Y";
                }
            }
        }
    }
}



