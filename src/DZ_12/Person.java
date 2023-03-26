package DZ_12;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        Person form = new Person();

        System.out.println("\u001B[4mАнкета № 001\u001B[0m");
        String result1 = form.personInfo();
        System.out.println("Дякуємо, дані збережені." + "\n");

        System.out.println("\u001B[4mАнкета № 002\u001B[0m");
        String result2 = form.personInfo();
        System.out.println("Дякуємо, дані збережені." + "\n");

        System.out.println("\u001B[4mАнкета № 003\u001B[0m");
        String result3 = form.personInfo();
        System.out.println("Дякуємо, дані збережені." + "\n");

        System.out.println("a. " + result1);
        System.out.println("b. " + result2);
        System.out.println("c. " + result3);
    }

    private String personInfo() {

        Scanner inName = new Scanner(System.in);
        System.out.print("Введіть будь ласка ІМ'Я: ");
        String name = inName.nextLine();

        Scanner inSurname = new Scanner(System.in);
        System.out.print("Введіть будь ласка ПРІЗВИЩЕ: ");
        String surname = inSurname.nextLine();

        Scanner inTown = new Scanner(System.in);
        System.out.print("Введіть будь ласка МІСТО: ");
        String town = inTown.nextLine();

        Scanner inNumber = new Scanner(System.in);
        System.out.print("Введіть будь ласка НОМЕР ТЕЛЕФОНУ: ");
        String number = inNumber.nextLine();

        return "Зателефонувати громадянину " + name + " " + surname + " із міста " + town + " можна за номером " + number;
    }
}

