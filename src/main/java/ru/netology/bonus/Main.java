package ru.netology.bonus;

import ru.netology.bonus.BonusService;

class Main {
    public static void main(String[] args) {
       BonusService service = new BonusService();
        // подготавливаем данные:
       long amount = 1000_60; // внесенная сумма
       boolean registred = true; //  пользователь зарегестрирован
       long expected = 30; // ожидаемый результат
        // вызываем целевой метод:
        long actual = service.calculate(amount,registred); // фактический результат
        // // производим проверку (сравниваем ожидаемый и фактический):
        boolean passed = expected == actual;


       System.out.println(service.calculate(10000, true));
    }
}
