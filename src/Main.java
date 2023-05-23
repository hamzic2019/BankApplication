import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Application");

        User haris = new User("Haris Hamzic", "hamzicharis", 250);
        User amina = new User("Amina Hamzic", "suljovicamina");
        User esfija = new User("Esfija Hamzic", "hamzicesfija");


        ArrayList<User> users = new ArrayList<>();

        users.add(haris);
        users.add(amina);
        users.add(esfija);


        Scanner scanner = new Scanner(System.in);

        boolean isDone = false;

        while(!isDone){
            System.out.println("#  Enter command: ");
            System.out.println("1. New User");
            System.out.println("2. Show Account Holders");
            System.out.println("3. Make an Transaction");
            System.out.println("4. Show transactions for specific Account holder");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();

                    System.out.print("Enter your deposit: ");
                    double deposit = scanner.nextDouble();

                    User newUser = new User(name, username, deposit);
                    users.add(newUser);
                    break;
                case 2:
                    for(User user : users){
                        System.out.println(user);
                    }
                    break;
                case 3:
                    System.out.println("Make a Transaction");
                    User tempuser = null;
                    for(User user: users){
                        if(user.username.equals("suljovicamina")){
                            tempuser = user;
                        }
                    }
                    for(User user: users){
                        if(user.username.equals("hamzicharis")){
                            user.sendMoney(tempuser, 50);
                        }
                    }
                    break;
                default:
                    isDone = true;
                    break;
            }
        }

    }
}