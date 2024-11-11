package ru.pshenichnikova.math;

public class FractionValue implements Summable {
    // Поле для хранения числителя дроби
    private final int numerator;

    // Поле для хранения знаменателя дроби
    private final int denominator;

    /**
     * Конструктор класса FractionValue.
     *
     * @param numerator Числитель дроби
     * @param denominator Знаменатель дроби
     */
    public FractionValue(int numerator, int denominator) {
        // Проверка на нулевой знаменатель и выброс исключения, если он равен нулю
        if (denominator == 0) {
            throw new ArithmeticException("Знаменатель не может быть равен нулю.");
        }
        // Инициализация полей класса
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Переопределенный метод из интерфейса Summable.
     * Возвращает значение дроби в виде числа с плавающей точкой.
     *
     * @return Дробное значение в виде числа с плавающей точкой
     */
    @Override
    public double toDouble() {
        // Вычисление значения дроби как частного числителя от знаменателя
        return (double) numerator / denominator;
    }
}

