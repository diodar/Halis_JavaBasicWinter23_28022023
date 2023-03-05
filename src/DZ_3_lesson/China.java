package DZ_3_lesson;

public class China {
    public static void main(String[] args) {

        int voinLi = 13;
        int luchnykLi = 24;
        int vershnykLi = 46;
        int kilkistLi = 860;
        int armiyaLi = (voinLi+luchnykLi+vershnykLi)*kilkistLi;

        int voinLMin = 9;
        int luchnykMin = 35;
        int vershnykMin = 12;
        double kilkistMin = kilkistLi * 1.5;
        double armiyaMin = (voinLMin+luchnykMin+vershnykMin)*kilkistMin;

        System.out.println("Армія Лі = " + armiyaLi);
        System.out.println("Армія Мінь = " + armiyaMin);
    }
}
