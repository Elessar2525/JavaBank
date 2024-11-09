package javabank.service;

public class BankingService {

    private final AccountService accountService;
    private final UserService userService;
    private final TransferService transferService;

    public BankingService(AccountService accountService, UserService userService, TransferService transferService) {
        this.accountService = accountService;
        this.userService = userService;
        this.transferService = transferService;
    }

}
