import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    String username;
    private double balance;

    private ArrayList<String> transactions = new ArrayList<>();
    Date date = new Date();

    public User(String name, String username, double balance){
        this.name = name;
        this.username = username;
        this.balance = balance;
    }

    public User(String name, String username){
        this.name = name;
        this.username = username;
        this.balance = 0.00;
    }

    public void showBalance(){
        System.out.println(this.username + " current account balance amounts to: $" + this.balance);
    }

    public void sendMoney(User user2send, double amount){
        this.balance -= amount;
        user2send.balance += amount;
        String message = ("On "+ date +",'"+ this.username +"' initiated a transfer of $"+ amount +" to recipient '"+user2send.username+"'");
        transactions.add(message);

        user2send.transactions.add(message);
    }

    public void listTransactions(){
        System.out.println("- -- -");
        int index = 1;
        for(Object x : transactions){
            System.out.println(index++ + ". " + x);
        }
    }

    public void depositMoney(double amount){
        this.balance += amount;
    }

    @Override
    public String toString(){
        return "User: " + name + ", Username: " + username + ", Balance: " + balance;
    }

}
