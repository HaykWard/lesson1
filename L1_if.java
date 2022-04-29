package lesson1;

public class L1_if {
    public static void main(String[] args) {

        int digit = 13;
        if (digit >= 1 && digit <=12) {
            if (digit == 12 || digit == 1 || digit == 2) {
                System.out.println("Winter");
            }
            if (digit == 3 || digit == 4 || digit == 5) {
                System.out.println("Spring");
            }
            if (digit == 6 || digit == 7 || digit == 8) {
                System.out.println("Summer");
            }
            if (digit == 9 || digit == 10 || digit ==11) {
                System.out.println("Autumn");
            }
        }else {
            System.out.println("Введите число от 1 до 12 включительно");
        }
    }
}
