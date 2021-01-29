package com.cmi.create_payment_account_micoservice.entities;

public class Information {

    private String cin;
    private long bank_id;

    public long getBank_id() {
        return bank_id;
    }

    public void setBank_id(long bank_id) {
        this.bank_id = bank_id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
