public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(1, "Иван", "Иванов", 151);
        Client client2 = new Client(2, "Анна", "Петрова", 152);

        DefoltTicket regular = new DefoltTicket(client1);
        VIPTicket vip = new VIPTicket(client2);

        FitnessClub club = new FitnessClub();

        System.out.println("<<< Проверка доступа >>>");
        System.out.println("--------------------------------");

        club.registerInZone(regular, "gym");

        club.registerInZone(regular, "pool");

        club.registerInZone(regular, "group");

        System.out.println("--------------------------------");

        club.registerInZone(vip, "gym");

        club.registerInZone(vip, "pool");

        club.registerInZone(vip, "group");

        System.out.println("--------------------------------");
    }
}