package ru.itpark.service;

import ru.itpark.model.ModemUsersTariff;
import ru.itpark.model.OtherRatesTariff;
import ru.itpark.model.Tariff;
import ru.itpark.model.TurnOnTariff;

public class CartService {
        private Tariff[] tariffs = new Tariff[10];
        private int size;

        public void add(Tariff tariff){
            tariffs[size++] = tariff;
            if (tariff instanceof TurnOnTariff) {
                TurnOnTariff turnOnTariff = (TurnOnTariff) tariff;
            }
            if (tariff instanceof ModemUsersTariff) {
                ModemUsersTariff modemUsersTariff = (ModemUsersTariff) tariff;
            }
            if (tariff instanceof OtherRatesTariff) {
                OtherRatesTariff otherRatesTariff = (OtherRatesTariff) tariff;
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
