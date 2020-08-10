package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int amountofSum = calculateSum(sales);
        int months = sales.length;
        int average = amountofSum / months;

        return average;
    }

    public int findMax(int[] sales) {
        int numberMaxMonth = 0;
        int maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                numberMaxMonth = i + 1;
            }
        }
        return numberMaxMonth;
    }

    public int findMin(int[] sales) {
        int numberMinMonth = 0;
        int minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                numberMinMonth = i + 1;
            }
        }
        return numberMinMonth;
    }

    public int lessThanAverage(int[] sales) {
        int average = calculateAverage(sales);
        int sum = 0;
        for (int sale : sales) {
            if (sale < average) {
                sum = sum + 1;
            }

        }
        return sum;
    }

    public int moreThanAverage(int[] sales) {
        int average = calculateAverage(sales);
        int sum = 0;
        for (int sale : sales) {
            if (sale > average) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}
