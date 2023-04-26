package DZ_15_upd;

import java.util.Scanner;

import static DZ_15_upd.DrinksMachine.*;

public class DrinkSwitcher {

    final int TEA_COST = 40;
    final int COFFEE_COST = 60;
    final int LEMONADE_COST = 50;
    final int MOKHITO_COST = 90;
    final int MINERAL_COST = 25;
    final int COCA_COLA_COST = 35;
    int teaTotal = 0;
    int coffeeTotal = 0;
    int lemonadeTotal = 0;
    int mokhitoTotal = 0;
    int mineralTotal = 0;
    int cocaColaTotal = 0;
    int numTea = 0;
    int numCoffee = 0;
    int numLemonade = 0;
    int numMokhito = 0;
    int numMineral = 0;
    int numCocaCola = 0;


    public void drinkSwitcher(DrinksMachine drink, int quantity) {
        switch (drink) {
            case TEA:
                int i = 1;
                do {
                    System.out.println("-----Ваш ЧАЙ готується, очікуйте будь ласка-----");
                    System.out.println("------------------------3-----------------------");
                    System.out.println("------------------------2-----------------------");
                    System.out.println("------------------------1-----------------------");
                    System.out.println("---------------Ваш ЧАЙ вже готовий--------------" + "\n");
                    teaTotal += TEA_COST;
                    i++;
                } while (i <= quantity);
                numTea += quantity;
                break;

            case COFFEE:
                int j = 1;
                do {
                    System.out.println("-----Ваша КАВА готується, очікуйте будь ласка-----");
                    System.out.println("-------------------------3------------------------");
                    System.out.println("-------------------------2------------------------");
                    System.out.println("-------------------------1------------------------");
                    System.out.println("---------------Ваша КАВА вже готова---------------" + "\n");
                    coffeeTotal += COFFEE_COST;
                    j++;
                } while (j <= quantity);
                numCoffee += quantity;
                break;

            case LEMONADE:
                int k = 1;
                do {
                    System.out.println("-----Ваш ЛИМОНАД готується, очікуйте будь ласка-----");
                    System.out.println("--------------------------3-------------------------");
                    System.out.println("--------------------------2-------------------------");
                    System.out.println("--------------------------1-------------------------");
                    System.out.println("---------------Ваш ЛИМОНАД вже готовий--------------" + "\n");
                    lemonadeTotal += LEMONADE_COST;
                    k++;
                } while (k <= quantity);
                numLemonade += quantity;
                break;

            case MOKHITO:
                int l = 1;
                do {
                    System.out.println("-----Ваш МОХІТО готується, очікуйте будь ласка-----");
                    System.out.println("-------------------------3-------------------------");
                    System.out.println("-------------------------2-------------------------");
                    System.out.println("-------------------------1-------------------------");
                    System.out.println("---------------Ваш МОХІТО вже готовий--------------" + "\n");
                    mokhitoTotal += MOKHITO_COST;
                    l++;
                } while (l <= quantity);
                numMokhito += quantity;
                break;

            case MINERALWATER:
                int m = 1;
                do {
                    System.out.println("-----Ваша МІНЕРАЛЬНА ВОДА готується, очікуйте будь ласка-----");
                    System.out.println("-------------------------------3-----------------------------");
                    System.out.println("-------------------------------2-----------------------------");
                    System.out.println("-------------------------------1-----------------------------");
                    System.out.println("---------------Ваша МІНЕРАЛЬНА ВОДА вже готова---------------" + "\n");
                    mineralTotal += MINERAL_COST;
                    m++;
                } while (m <= quantity);
                numMineral += quantity;
                break;

            case COCACOLA:
                int n = 1;
                do {
                    System.out.println("-----Ваша КОКАКОЛА готується, очікуйте будь ласка-----");
                    System.out.println("---------------------------3--------------------------");
                    System.out.println("---------------------------2--------------------------");
                    System.out.println("---------------------------1--------------------------");
                    System.out.println("---------------Ваша КОКАКОЛА вже готова---------------" + "\n");
                    cocaColaTotal += COCA_COLA_COST;
                    n++;
                } while (n <= quantity);
                numCocaCola += quantity;
                break;

            default:
                throw new IllegalStateException("Нема такого напою: " + drink);
        }
    }

    public static DrinksMachine userDrinkChoice() {

        boolean isDrinkInDrinkMachine = false;
        String capsDrinkChoice = null;

        System.out.println('\n' + "\033[4m" + "ОБЕРІТЬ БУДЬ ЛАСКА НАПІЙ ТА ВКАЖІТЬ КІЛЬКІСТЬ:" + "\033[0m");

        while (!isDrinkInDrinkMachine) {

            Scanner drinkScannerIn = new Scanner(System.in);
            System.out.print("Назва напою: ");
            String drinksChoice = drinkScannerIn.nextLine();

            capsDrinkChoice = drinksChoice.toUpperCase();

            boolean validInput = false;

            for (DrinksMachine drinksMachine : DrinksMachine.values()) {
                if (drinksMachine.name().equals(capsDrinkChoice)) {
                    isDrinkInDrinkMachine = true;
                    validInput = true;
                    break;
                }
            }
            if (!validInput) {
                System.out.println("Некоректне введення, спробуйте будь ласка ще раз" + '\n');
            }
        }
        return DrinksMachine.valueOf(capsDrinkChoice);
    }

    public static int userNumChoice() {

        int number;
        Scanner numScannerIn = new Scanner(System.in);

        while (true) {
            System.out.print("Кількість (0-9): ");
            if (numScannerIn.hasNextInt()) {
                number = numScannerIn.nextInt();
                break;
            } else {
                System.out.println("Помилка! Введено не число" + '\n');
                numScannerIn.next();
            }
        }
        return number;
    }

    public void totalCost() {

        int needToPay = teaTotal + coffeeTotal + lemonadeTotal + mokhitoTotal + mineralTotal + cocaColaTotal;
        System.out.println();
        System.out.println("Дякуємо, що скористалися нашим онлайн-баром");
        System.out.println("\033[4m" + "ВИ ЗАМОВИЛИ:" + "\033[0m" + "\n" +
                TEA + " - " + numTea + "\n" +
                COFFEE + " - " + numCoffee + "\n" +
                LEMONADE + " - " + numLemonade + "\n" +
                MOKHITO + " - " + numMokhito + "\n" +
                MINERALWATER + " - " + numMineral + "\n" +
                COCACOLA + " - " + numCocaCola + "\n" +
                "\033[4m" + "ВСЬОГО ДО СПЛАТИ: " + needToPay + " грн" + "\033[0m");
    }
}
