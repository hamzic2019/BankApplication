public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Application");

        User haris = new User("Haris Hamzic", "hamzicharis", 250);
        User amina = new User("Amina Hamzic", "suljovicamina");
        User esfija = new User("Esfija Hamzic", "hamzicesfija");


        haris.sendMoney(amina, 49);
        haris.sendMoney(amina, 25);
        haris.sendMoney(esfija, 100);

        haris.listTransactions();
        amina.listTransactions();

        haris.showBalance();
        amina.showBalance();

    }
}