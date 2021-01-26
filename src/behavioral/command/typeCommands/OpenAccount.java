package behavioral.command.typeCommands;

import behavioral.command.Account;

public class OpenAccount implements Command{
    private Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}
