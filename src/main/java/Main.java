import javabank.service.BankingService;
import javabank.db.impl.InMemAccRepository;
import javabank.service.AccountService;
import javabank.db.impl.InMemTransRepository;
import javabank.service.TransferService;
import javabank.db.impl.InMemUserRepository;
import javabank.model.User;
import javabank.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountService account = new AccountService(new InMemAccRepository());
        BankingService bankingService = new BankingService(account, new UserService(new InMemUserRepository() {
            @Override
            public User getUser(String s) {
                return null;
            }
        }), new TransferService(account, new InMemTransRepository()));
        TransferService transferService = new TransferService(account, new InMemTransRepository());

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank of Java");
        System.out.println("Which account Id you want to check?");
        int accId = 0;
        try {
            accId = sc.nextInt();
            account.accExists(accId);
        } catch (IllegalAccessError e) {
            System.out.println("Account does nor exist.");

        } catch (Exception e) {
            System.out.println("Unknown exception occurred: " + e.getMessage());
        }
        int option = 0;
        while (option != 5) {
            System.out.println("What would you like to do next?");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    double balance = account.getBalance(accId);
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    Scanner scanner = new Scanner(System.in);
                    double amount = scanner.nextDouble();
                    account.deposit(accId, amount);
                    System.out.println("Deposit has been added to your account.");
                    System.out.println("Your balance now is: " + account.getBalance(accId));
                    break;
                case 3:
                    try {
                        System.out.print("Enter the amount to withdraw: $");
                        Scanner scanner = new Scanner(System.in);
                        double amount = scanner.nextDouble();
                        account.withdraw(accId, amount);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Unknown exception occurred: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        //todo: uwaga do całego blolku, po co wołasz  metody z accountService takie jak getUser(), getAcc()
                        // skoro i tak z nich nie kożystasz?
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter your full name");
                        String sourceUser = scanner.nextLine();
                        account.getUser(sourceUser);
                        System.out.println("Enter your accountId");
                        int sourceAccId = scanner.nextInt();
                        account.getAcc(sourceAccId);
                        scanner.nextLine();
                        //todo: skoro na początku podajesz id użytkowniika to lepiej założyć
                        // że już wiesz, którym użytkownikiem jesteś
                        System.out.println("Enter target full name");
                        String targetUser = scanner.nextLine();
                        //todo: Zamiast target user w posataci imienia i nazwiska IMO lepiej dodać numer konta,
                        // takie sane jak imie nazwisko adres dodamy później
                        account.getUser(targetUser);
                        System.out.println("Enter target accountId");
                        int targetAccId = scanner.nextInt();
                        account.getAcc(targetAccId);
                        System.out.println("Enter the amount to transfer");
                        double transferAmount = scanner.nextDouble();
                        transferService.transfer(sourceAccId, targetAccId, transferAmount);
                    } catch (IllegalStateException e) {
                        System.out.println("Error");
                    }

                    break;
                case 5:
                    System.out.println("Thank you for banking with us. Have a great day!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}