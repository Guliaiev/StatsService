package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSum(purchases);
        System.out.println("Сумма всех продаж: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void findAverageSum() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.findAverageSum(purchases);
        System.out.println("Средняя сумма продаж: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void findLastMonthMax() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findLastMonthMax(purchases);
        System.out.println("Номер месяца, в котором был пик продаж: " + actual);
        assertEquals(expected, actual);
    }
    @Test
    void findLastMonthMin() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findLastMonthMin(purchases);
        System.out.println("Номер месяца, в котором был минимум продаж: " + actual);
        assertEquals(expected, actual);
    }
    @Test
    void quantityMontUnderAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.quantityMontUnderAverage(purchases);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего : " + actual);
        assertEquals(expected, actual);
    }
    @Test
    void quantityMontOverAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.quantityMontOverAverage(purchases);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего : " + actual);
        assertEquals(expected, actual);
    }
}
