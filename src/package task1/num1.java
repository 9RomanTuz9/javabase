import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца : ");

        int mounth = scanner.nextInt();

    
        if (mounth >= 1 || mounth <= 2 || mounth == 12)
        {
            System.out.println("зима");
        } else if (mounth >= 3 || mounth <= 5)
        {
            System.out.println("весна");
        }
        else if (mounth >= 6 || mounth <= 8)
        {
            System.out.println("лето");
        }
        else if (mounth >= 9 || mounth <= 11)
        {
            System.out.println("осень");
        }
        else
        {
            System.out.println("некорректный номер месяца!");
        }

    
    }
}