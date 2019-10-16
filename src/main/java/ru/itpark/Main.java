package ru.itpark;

import ru.itpark.model.ModemUsers;
import ru.itpark.model.OtherRates;
import ru.itpark.model.Tariff;
import ru.itpark.model.TurnOn;
import ru.itpark.service.CartService;

public class Main {
    public static void main(String[] args) {
        CartService service = new CartService();
        service.add(new TurnOn("smotri", "Включайся! Смотри", 1200, "Безлимитно", 650, 300, 30));
        service.add(new TurnOn("obschaysya", "Включайся! Общайся", 600, "Безлимитно", 350, 0, 30));
        service.add(new ModemUsers("tvoj_bezlimit_na_6_mesyacev", "Твой безлимит на 6 месяцев", 1200, "Безлимитно", 3100, 6));
        service.add(new ModemUsers("tvoj_bezlimit_na_12_mesyacev", "Твой безлимит на 12 месяцев", 1200, "Безлимитно", 5100, 12));
        service.add(new OtherRates("perehodi_na_nol", "Переходи на НОЛЬ", 0, "100 МБ интернета", 0, "1 ₽ за минуту", "1,4 ₽ за минуту"));
        service.add(new OtherRates("teplyy_priem", "Тёплый приём Акция", 50, "Безлимитно", 350, "Безлимитно", "50 минут"));
        service.print();
    }
}
