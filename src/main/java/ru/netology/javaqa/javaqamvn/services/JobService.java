package ru.netology.javaqa.javaqamvn.services;

public class JobService {


    public int calculate(long income, long expenses, long threshold) {
        int count = 0; // счётчик месяцев отдыха
        long money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Если достаточно средств, то отдыхаем
                money -= expenses;
               money/= 3; // Уменьшаем деньги на счету на расходы во время отдыха
                count++;
            } else {
                // Иначе работаем
                money += income - expenses; // Добавляем доход и вычитаем расходы
            }
        }

        return count;
    }
}
