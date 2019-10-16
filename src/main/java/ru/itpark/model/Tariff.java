package ru.itpark.model;

public class Tariff {
    private String id;
    private String name;
    private int minutes;
    private String internet;
    private int price;

    public Tariff(String id, String name, int minutes, String internet, int price) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.internet = internet;
        this.price = price;
    }

    public Tariff() {
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", minutes=" + minutes +
                ", internet='" + internet + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
