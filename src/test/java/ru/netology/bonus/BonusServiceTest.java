package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.bonus.BonusService;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(String testName, long amount, boolean registered, long expected) {
        // создание нового объекта
         BonusService service = new BonusService();
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected,actual);
    }
}