
import java.util.Random;

public class num1 {

    public static void main(String[] args) {
        Random random = new Random();
        int color = random.nextInt(3);

        System.out.println("Цвет: " + color);

        if (color == 0) {
            System.out.println("Красный");
        } else if (color == 1) {
            System.out.println("Желтый");
        } else if (color == 2) {
            System.out.println("Зеленый");
        }
    }

}
