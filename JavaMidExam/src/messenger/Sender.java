package messenger;

public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "Test", "Halo!");
        std.sendMessage("Wilsander", "Super-Gene-Awakening-Elixir", "Take this to make you strong");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("Black Star", "Will power", "I Will Be Beyond Grade A Rank!");
        mail.sendMessage("Herlous", "Life sustainabillity", "For the sake of my race!");
        mail.disconnect();
        mail.sendMessage("Volga", "Play", "Lets play star card!");
    }
}
