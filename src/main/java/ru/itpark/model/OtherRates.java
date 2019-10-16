package ru.itpark.model;

public class OtherRates extends Tariff {
    private String callMegaFonNumbers;
    private String otherCall;

    public OtherRates(String id, String name, int minutes, String internet, int price, String callMegaFonNumbers, String otherCall) {
        super(id, name, minutes, internet, price);
        this.callMegaFonNumbers = callMegaFonNumbers;
        this.otherCall = otherCall;
    }

    @Override
    public String toString() {
        return super.toString() + "OtherRates{" +
                "callMegaFonNumbers='" + callMegaFonNumbers + '\'' +
                ", otherCall='" + otherCall + '\'' +
                '}';
    }

    public String getCallMegaFonNumbers() {
        return callMegaFonNumbers;
    }

    public void setCallMegaFonNumbers(String callMegaFonNumbers) {
        this.callMegaFonNumbers = callMegaFonNumbers;
    }

    public String getOtherCall() {
        return otherCall;
    }

    public void setOtherCall(String otherCall) {
        this.otherCall = otherCall;
    }
}
