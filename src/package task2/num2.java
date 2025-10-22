
public class num2 {

    public static void main(String[] a) {
        int floors = 10;
        int kvartira = 5;
        for (int f = 1; f <= floors; f++) {
            for (int i = 1; i <= kvartira; i++) {
                System.out.println("Этаж " + f + ", Квартира " + i + " — посылка доставлена");
            }
        }
    }
}
