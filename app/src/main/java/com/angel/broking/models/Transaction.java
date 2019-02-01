package com.angel.broking.models;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 31-01-2019
 */
public class Transaction extends Type {
    private int icon;
    private String name;
    private String description;
    private float amount;
    private String date;
    private int type;
    private int dabitCredit;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDabitCredit() {
        return dabitCredit;
    }

    public void setDabitCredit(int dabitCredit) {
        this.dabitCredit = dabitCredit;
    }
}
