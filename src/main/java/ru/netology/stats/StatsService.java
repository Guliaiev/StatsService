package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int findAverageSum(int[] purchases) {
        int sum = calculateSum(purchases);
        int averageSum = sum / purchases.length;
        return averageSum;
    }

    public int findLastMonthMax(int[] purchases) {
        int month = 0;
        int maxMonth = 0;
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            month++;
            if (currentMax <= purchase) {
                currentMax = purchase;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public int findLastMonthMin(int[] purchases) {
        int month = 0;
        int minMonth = 0;
        int currentMin = purchases[0];
        for (int purchase : purchases) {
            month++;
            if (currentMin >= purchase) {
                currentMin = purchase;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int quantityMontUnderAverage(int[] purchases) {
        int monthQuantityUnder = 0;
        int average = findAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase < average)
                monthQuantityUnder++;
        }
        return monthQuantityUnder;
    }

    public int quantityMontOverAverage(int[] purchases) {
        int monthQuantityOver = 0;
        int average = findAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase > average)
                monthQuantityOver++;
        }
        return monthQuantityOver;
    }
}
