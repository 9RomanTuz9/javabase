
import java.util.Random;
import java.util.Scanner;
public class num6 {
    public static void main(String[] a) {
        Random r = new Random();

        int secret = r.nextInt(100) + 1;

        Scanner s = new Scanner(System.in);
        System.out.println("Угадай число от 1 до 100. У тебя 3 попытки.");

        System.out.print("Попытка 1: ");
        int x1 = s.nextInt();

        if (x1 == secret) {
            System.out.println("Угадал!");
            return;
        } else if (x1 > secret) System.out.println("Меньше");
        else System.out.println("Больше");

        System.out.print("Попытка 2: ");
        int x2 = s.nextInt();

        if (x2 == secret) {
            System.out.println("Угадал!");
            return;
        } else if (x2 > secret) System.out.println("Меньше");
        else System.out.println("Больше");

        System.out.print("Попытка 3: ");
        int x3 = s.nextInt();
        
        if (x3 == secret) {
            System.out.println("Угадал!");
        } else {
            System.out.println("Не угадал! Было число: " + secret);
        }
    }
}
