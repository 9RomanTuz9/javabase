import java.util.Random;

public class num3 {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(100) + 1;

        if (score >= 90)
        {
            System.out.println("отлично");
        }
        else if (score >= 60)
        {
            System.out.println("хорошо");
        }
        else if (score >= 40)
        {
            System.out.println("удовлетворительно");
        }
        else
        {
            System.out.println("неудовлетворительно");
        }
    }
}
