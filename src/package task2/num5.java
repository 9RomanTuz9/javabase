
import java.util.Scanner;

public class num5 {

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int correct = 0;
        int ans;

        System.out.println("1. Столица Франции?");
        System.out.println("1) Париж  2) Лондон  3) Рим");
        ans = sc.nextInt();
        if (ans == 1) {
            System.out.println("Правильно");

        } else {
            System.out.println("Неправильно");
        }

        System.out.println("2. Сколько дней в високосном году?");
        System.out.println("1) 365  2) 366  3) 360");
        ans = sc.nextInt();
        if (ans == 2) {
            System.out.println("Правильно");

        } else {
            System.out.println("Неправильно");
        }

        System.out.println("3. Какая планета ближе к Солнцу?");
        System.out.println("1) Земля  2) Венера  3) Меркурий");
        ans = sc.nextInt();
        if (ans == 3) {
            System.out.println("Правильно");

        } else {
            System.out.println("Неправильно");
        }

        System.out.println("4. Сколько метров в километре?");
        System.out.println("1) 1000  2) 100  3) 10");
        ans = sc.nextInt();
        if (ans == 1) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

        System.out.println("5. Какой язык использовался для Android раньше?");
        System.out.println("1) Java  2) Python  3) C++");
        ans = sc.nextInt();
        if (ans == 1) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

        System.out.println("6. Цвет неба в ясную погоду?");
        System.out.println("1) Синий  2) Зелёный  3) Красный");
        ans = sc.nextInt();
        if (ans == 1) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

        System.out.println("7. 2+2*2 равно?");
        System.out.println("1) 8  2) 6  3) 4");
        ans = sc.nextInt();
        if (ans == 2) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

        System.out.println("8. Какая часть суток идёт после утра?");
        System.out.println("1) День  2) Вечер  3) Ночь");
        ans = sc.nextInt();
        if (ans == 2) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

        System.out.println("9. Какой газ мы вдыхаем для жизни?");
        System.out.println("1) Кислород  2) Азот  3) Углекислый газ");
        ans = sc.nextInt();
        if (ans == 1) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

        System.out.println("10. Какая цифра идёт после 9?");
        System.out.println("1) 8  2) 10  3) 0");
        ans = sc.nextInt();
        if (ans == 2) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }

        System.out.println("Правильных ответов: " + correct + " из 10");
    }
}
