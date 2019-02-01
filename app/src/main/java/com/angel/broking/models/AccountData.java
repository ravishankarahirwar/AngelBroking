package com.angel.broking.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 01-02-2019
 */
public class AccountData {

   private static List<Account> accounts = new ArrayList<>();

    public static List<Account> getAccountList() {
        accounts.clear();
    Account account1 = new Account();
        account1.setWalletName("Main Wallet");
        account1.setAmount(2049.95f);
        account1.setStatus(1);
        account1.setWalletType(Account.MAIN_WALLET);
        accounts.add(account1);

    Account account2 = new Account();
        account2.setWalletName("Savings Wallet");
        account2.setAmount(32.42f);
        account2.setWalletType(Account.SAVING_WALLET);
        account2.setStatus(2);
        accounts.add(account2);

    Account account3 = new Account();
        account3.setWalletName("Summer Wallet");
        account3.setAmount(332.42f);
        account3.setWalletType(Account.SUMMER_WALLET);
        account3.setStatus(1);
        accounts.add(account3);

        return accounts;
}
}
