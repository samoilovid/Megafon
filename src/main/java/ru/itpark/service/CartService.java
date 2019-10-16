package ru.itpark.service;

import ru.itpark.model.ModemUsers;
import ru.itpark.model.OtherRates;
import ru.itpark.model.Tariff;
import ru.itpark.model.TurnOn;

public class CartService {
        private Tariff[] tariffs = new Tariff[10];
        private int size;

        public void add(Tariff tariff){
            tariffs[size++] = tariff;
            if (tariff instanceof TurnOn) {
                TurnOn turnOn = (TurnOn) tariff;
            }
            if (tariff instanceof ModemUsers) {
                ModemUsers modemUsers = (ModemUsers) tariff;
            }
            if (tariff instanceof OtherRates) {
                OtherRates otherRates = (OtherRates) tariff;
            }
        }
    public void print(){

        for (int j = 0; j < tariffs.length; j++) {
            System.out.println(tariffs[j]);
            
        }
    }
    public Tariff[] getTariffs() {
        return tariffs;
    }

    public void setTariffs(Tariff[] tariffs) {
        this.tariffs = tariffs;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
