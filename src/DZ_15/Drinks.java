package DZ_15;

import java.util.Scanner;

import static DZ_15.DrinksMachine.*;

public class Drinks {

    public static void main(String[] args) {

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
        String question;
        int quantity;

        Scanner scanner = new Scanner(System.in);
        question = "Y";
        for (int q = 0; question.equals("Y"); q++) {
            if (q == 0) {
                System.out.print("\033[4m" + "ВІТАЄМО ВАС У НАШОМУ ОНЛАЙН-БАРІ =)" + "\033[0m" + "\n");
                System.out.print("Ознайомтесь з нашою барною картою:" + "\n" + TEA + " " + COFFEE + " " +
                        LEMONADE + " " + MOKHITO + " " + MINERALWATER + " " + COCACOLA + "\n");
                System.out.print("\n" + "Бажаєте щось замовити? (Y/N): ");
                question = scanner.nextLine().toUpperCase();
                System.out.println();

                if (question.equals("Y")) {

                    DrinksMachine drink = userDrinkChoice();
                    quantity = userNumChoice();

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
            }

            if (q > 0) {
                System.out.print("Бажаєте замовити щось ще? (Y/N): ");
                question = scanner.nextLine().toUpperCase();
                System.out.println();

                if (question.equals("N")) {

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
                } if (question.equals("Y")) {

                    DrinksMachine drink = userDrinkChoice();
                    quantity = userNumChoice();

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

            }
        }
    }
    public static DrinksMachine userDrinkChoice() {

        System.out.println("\033[4m" + "ОБЕРІТЬ БУДЬ ЛАСКА НАПІЙ ТА ВКАЖІТЬ КІЛЬКІСТЬ:" + "\033[0m");
        Scanner drinkScannerIn = new Scanner(System.in);
        System.out.print("Назва напою: ");
        String drinksChoice = drinkScannerIn.nextLine();

        String capsDrinkChoice = drinksChoice.toUpperCase();
        DrinksMachine drink = DrinksMachine.valueOf(capsDrinkChoice);

        return drink;
    }

    public static int userNumChoice() {

        Scanner numScannerIn = new Scanner(System.in);
        System.out.print("Кількість: ");
        int quantity = numScannerIn.nextInt();

        return quantity;
    }

}


