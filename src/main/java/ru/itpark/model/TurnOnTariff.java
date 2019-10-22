package ru.itpark.model;

public class TurnOnTariff extends Tariff {
    private int sms;
    private int cashback;

    public TurnOnTariff(String id, String name, int minutes, String internet, int price, int sms, int cashback) {
        super(id, name, minutes, internet, price);
        this.sms = sms;
        this.cashback = cashback;
    }

    @Override
    public String toString() {
        return super.toString() + "TurnOn{" +
                "sms=" + sms +
                ", cashback=" + cashback +
                '}';
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}
