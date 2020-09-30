package com.company;
import java.time.YearMonth;

public class Main {

    public static void main(String[] args) {

        printBonusDatesBetween(2010, 2015);
    }

    static void printBonusDatesBetween(int fromYear, int toYear) {
        for (; fromYear <= toYear; fromYear++) {
            for (int month = 1; month <= 12; month++) {

                YearMonth yearMonth = YearMonth.of(fromYear, month);
                int allDays = yearMonth.lengthOfMonth();

                for (int day = 1; day <= allDays; day++) {

                    String formattedMonth = String.format("%02d",month);
                    String formattedDay = String.format("%02d",day);
                    String fullDate = Integer.toString(fromYear) + formattedMonth + formattedDay;

                    String palindrome = "";

                    for (int i = fullDate.length() - 1; i >= 0; i--) {
                        palindrome = palindrome + fullDate.charAt(i);
                    }


                    if (fullDate.equals(palindrome)) {
                        System.out.println(fromYear + "-" + formattedMonth + "-" + formattedDay);
                    }
                }
            }
        }
    }
}

