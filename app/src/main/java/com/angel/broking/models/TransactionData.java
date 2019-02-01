package com.angel.broking.models;

import com.angel.broking.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 01-02-2019
 */
public class TransactionData {
    private static List<Transaction> transactions = new ArrayList<>();

    public static List<Transaction> getTransactionList() {
        transactions.clear();
        Transaction user1 = new Transaction();
        user1.setIcon(R.drawable.ic_music_note_black_24dp);
        user1.setName("Soney Play Station");
        user1.setDescription("Fifa 2022 Game");
        user1.setDate("March 14, 2021");
        user1.setAmount(53.95f);
        user1.setType(Transaction.TYPE_DABIT);
        transactions.add(user1);

        Transaction user2 = new Transaction();
        user2.setIcon(R.drawable.ic_location_city_black_24dp);
        user2.setName("Bank Transfer");
        user2.setDescription("Salary for March");
        user2.setDate("April 14, 2021");
        user2.setAmount(2500.95f);
        user2.setType(Transaction.TYPE_CREDIT);
        transactions.add(user2);

        Transaction user3 = new Transaction();
        user3.setIcon(R.drawable.ic_coffe);
        user3.setName("Coffee Shop");
        user3.setDescription("Coffe with Sarah");
        user3.setDate("April 12, 2021");
        user1.setAmount(5.42F);
        user3.setType(Transaction.TYPE_DABIT);
        transactions.add(user3);

        Transaction user4 = new Transaction();
        user4.setIcon(R.drawable.ic_home_black_24dp);
        user4.setName("Flat Rental");
        user4.setDescription("Apartment Rental");
        user4.setDate("April 09, 2021");
        user4.setType(Transaction.TYPE_DABIT);
        user4.setAmount(445.00f);
        transactions.add(user4);

        return transactions;
    }
}
