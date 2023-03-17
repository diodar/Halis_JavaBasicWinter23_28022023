package DZ_6_7_8;

public class Shuttle {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("Забобонна нумерація шатлів: " + '\n');

        for (int i = 1; i <= 200; i++) {
            String number = Integer.toString(i);
            if (number.contains("4") || number.contains("9"))
                continue;
            {
                if (count <= 100) {
                    System.out.println(count + "_Shuttle № " + number);
                    count++;
                }
            }
        }
    }
}

/*
Долго мучался и как только не крутил через while, подскажите пожалуйста,
почему счетчик продолжает считать дальше когда count становилось больше 100,
продолжает подставлять i до 200? что я делал не так7)

package DZ_6_7_8;

public class Shuttle {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 100) {
            for (int i = 1; i <= 200; i++) {
                String number = Integer.toString(i);
                if (number.contains("4") || number.contains("9")) {
                    continue;
                }
                System.out.println(count + "Shuttle № " + number);
                count++;
            }
        }
    }
}*/
