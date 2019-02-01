package com.angel.broking.models;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 01-02-2019
 */
public class Account extends Type {
    public static final int MAIN_WALLET = 1;
    public static final int SAVING_WALLET = 2;
    public static final int SUMMER_WALLET = 3;

    private String walletName;
    private float amount;
    private int progress;
    private int status;
    private int walletType;

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getWalletType() {
        return walletType;
    }

    public void setWalletType(int walletType) {
        this.walletType = walletType;
    }
}
