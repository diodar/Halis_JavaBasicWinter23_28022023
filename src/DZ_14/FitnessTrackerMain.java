package DZ_14;

public class FitnessTrackerMain {

    public static void main(String[] args) {

        NewFitnessAccount user1 = new NewFitnessAccount(
                "Ivan",
                "Petrov",
                12,
                12,
                2004,
                "i.petrov@gmail.com",
                380989868695L,
                3600,
                45.5,
                120,
                80);

        System.out.println("-----------------------проверка геттеров---------------------");
        System.out.println(user1.getAge());
        System.out.println(user1.getEmail());
        System.out.println(user1.getDateOfBirth());
        System.out.println(user1.getName());
        System.out.println(user1.getPhoneNumber());
        System.out.println("-------------------------------------------------------------");
        System.out.println("\033[4m" + "User 1" + "\033[0m" + "\n" + user1.printAccountInfo());
        user1.setPressure(115, 75);
        user1.setSurname("Gorbunkov");
        user1.setWeight(42.2);
        user1.setSteps(4800);
        System.out.println("-----------------------проверка сеттеров---------------------");
        System.out.println("\033[4m" + "User 1 upd" + "\033[0m" + "\n" + user1.printAccountInfo());

        NewFitnessAccount user2 = new NewFitnessAccount(
                "Katya",
                "Vlasenko",
                27,
                2,
                1987,
                "vlaska@gmail.com",
                380975821237L,
                6700,
                62.5,
                126,
                82);

        System.out.println("-----------------------проверка геттеров---------------------");
        System.out.println(user2.getAge());
        System.out.println(user2.getEmail());
        System.out.println(user2.getDateOfBirth());
        System.out.println(user2.getName());
        System.out.println(user2.getPhoneNumber());
        System.out.println("-------------------------------------------------------------");
        System.out.println("\033[4m" + "User 2" + "\033[0m" + "\n" + user2.printAccountInfo());
        user2.setPressure(119, 77);
        user2.setSurname("Kovalenko");
        user2.setWeight(60.7);
        user2.setSteps(10200);
        System.out.println("-----------------------проверка сеттеров---------------------");
        System.out.println("\033[4m" + "User 2 upd" + "\033[0m" + "\n" + user2.printAccountInfo());

        NewFitnessAccount user3 = new NewFitnessAccount(
                "Tetiana",
                "Buz'ko",
                1,
                5,
                1990,
                "buzkot@gmail.com",
                380999776623L,
                7770,
                51.3,
                110,
                70);

        System.out.println("-----------------------проверка геттеров---------------------");
        System.out.println(user3.getAge());
        System.out.println(user3.getEmail());
        System.out.println(user3.getDateOfBirth());
        System.out.println(user3.getName());
        System.out.println(user3.getPhoneNumber());
        System.out.println("-------------------------------------------------------------");
        System.out.println("\033[4m" + "User 3" + "\033[0m" + "\n" + user3.printAccountInfo());

    }
}