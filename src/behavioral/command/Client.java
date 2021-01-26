package behavioral.command;

import behavioral.command.typeCommands.CloseAccount;
import behavioral.command.typeCommands.Command;
import behavioral.command.typeCommands.OpenAccount;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("gpcoder");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
