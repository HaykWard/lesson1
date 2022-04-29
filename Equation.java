package lesson1;

public class Equation {

    public static void main(String[] args) {

        double a = 10, b = 1, c = 34, D;

        D = Math.pow(b,2) - 4*a*c;

        if (D < 0) {
            System.out.println("Дискриминант меньше нуля. Корней нет");
        }else {

            double x = (-b + Math.pow(D, 0.5)) / 2 * a;
            double y = (-b - Math.pow(D, 0.5)) / 2 * a;

            System.out.println("Корень первый равен" + x);
            System.out.println("Корень второй равен" + y);
        }
    }
}
