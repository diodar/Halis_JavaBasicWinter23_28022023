package DZ_13;

public class Burger {

    String bun;
    String cheese;
    String green;
    int meat = 1;
    boolean mayo = true;

    public Burger() {

        String burgerComposition = "булка, м'ясо, сир, зелень, майонез";
        System.out.println("Ви замовили звичайний бургер. Склад бургеру: " + burgerComposition);
    }

    public Burger(boolean mayo) {
        this.mayo = mayo;

        if (!(this.mayo)) {
            String burgerComposition = "булка, м'ясо, сир, зелень.";
            System.out.println("Ви замовили дієтичний бургер. Склад бургеру: " + burgerComposition);
        } else {
            String burgerComposition = "булка, м'ясо, сир, зелень, майонез.";
            System.out.println("Ви замовили звичайний бургер. Склад бургеру: " + burgerComposition);
        }
    }

    public Burger(int meat) {
        this.meat = meat;

        if (this.meat == 2) {
            String burgerComposition = "булка, подвійне м'ясо, сир, зелень, майонез.";
            System.out.println("Ви замовили подвійний бургер. Склад бургеру: " + burgerComposition);
        } else if (this.meat == 1) {
            String burgerComposition = "булка, м'ясо, сир, зелень, майонез.";
            System.out.println("Ви замовили звичайний бургер. Склад бургеру: " + burgerComposition);
        } else {
            throw new IllegalArgumentException("Допустима кількість м'яса: 1 або 2");
        }
    }
}