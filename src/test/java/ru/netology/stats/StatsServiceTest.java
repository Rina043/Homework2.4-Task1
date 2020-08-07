package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum () {

        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

@Test

void shouldCalculateAverage () {
    StatsService service = new StatsService ();

    int expected = 15;
    int actual = service.calculateAverage(sales);
    assertEquals(expected, actual);
}

@Test
    void shouldCalculateMax () {
        StatsService service = new StatsService ();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(sales);
    assertEquals(expected, actual);
}

@Test
    void shouldCalculateMin (){
        StatsService service = new StatsService ();
    int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 9;
    int actual = service.findMin(sales);
    assertEquals(expected, actual);
}

@Test
    void shouldCalculateLessThanAverage(){
        StatsService service = new StatsService ();
    int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.LessThanAverage(sales);
    assertEquals(expected, actual);
}
 @Test
    void shouldCalculateMoreThanAverage(){
        StatsService service = new StatsService ();
     int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
     int expected = 5;
     int actual = service.MoreThanAverage(sales);
     assertEquals(expected, actual);
 }
}
