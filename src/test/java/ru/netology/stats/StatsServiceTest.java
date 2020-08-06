package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum () {

        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }
}
