package ru.itpark.model;

public class ModemUsersTariff extends Tariff {
    private int months;

    public ModemUsersTariff(String id, String name, int minutes, String internet, int price, int months) {
        super(id, name, minutes, internet, price);
        this.months = months;
    }

    @Override
    public String toString() {

       return super.toString() + "ModemUsers{" +
                "months=" + months +
                '}';
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
