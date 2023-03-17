package DZ_6_7_8;

public class CounterStrike {
    public static void main(String[] args) {
        String teamName1 = "NAVI";
        int playerNavi1 = 32;
        int playerNavi2 = 18;
        int playerNavi3 = 27;
        int playerNavi4 = 11;
        int playerNavi5 = 9;

        String teamName2 = "FNATIC";
        int playerFnatic1 = 13;
        int playerFnatic2 = 23;
        int playerFnatic3 = 15;
        int playerFnatic4 = 8;
        int playerFnatic5 = 17;

        double result1 = ((playerNavi1 + playerNavi2 + playerNavi3 + playerNavi4 + playerNavi5) / 5.0);
        double result2 = ((playerFnatic1 + playerFnatic2 + playerFnatic3 + playerFnatic4 + playerFnatic5) / 5.0);

        /*System.out.println("Результати гри:");
        System.out.println(result1);
        System.out.println(result2);*/

        if (result1 > result2) {
            System.out.println("Перемогла команда " + teamName1 + " яка набрала " + result1 + " очків");
        } else if (result2 > result1) {
            System.out.println("Перемогла команда " + teamName2 + " яка набрала " + result2 + " очків");
        } else {
            System.out.println("Команди зіграли у нічию");
        }

    }
}
