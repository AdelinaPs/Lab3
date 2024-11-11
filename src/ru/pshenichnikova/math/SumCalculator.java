package ru.pshenichnikova.math;


public class SumCalculator {

    /**
     * Метод для суммирования значений объектов типа Summable.
     *
     * @param values - переменная аргументов, представляющих массив объектов типа Summable
     * @return возвращаемое значение типа double, представляющее сумму всех переданных значений
     */
    public static double sum(Summable... values) {
        // Инициализация переменной total с начальным значением 0
        double total = 0;

        // Цикл foreach для перебора всех элементов в массиве values
        for (Summable value : values) {
            // Добавление значения текущего элемента к общей сумме
            total += value.toDouble();
        }

        // Возврат итогового результата
        return total;
    }
}

