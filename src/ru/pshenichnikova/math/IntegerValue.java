package ru.pshenichnikova.math;

/**
 * Класс IntegerValue представляет целочисленный объект, который реализует интерфейс Summable.
 */
public class IntegerValue implements Summable {

    /**
     * Поле value хранит целое число, представляющее значение объекта IntegerValue.
     */
    private final int value;

    /**
     * Конструктор класса IntegerValue принимает целое число и устанавливает его как значение поля value.
     * @param value целое число для установки в объекте
     */
    public IntegerValue(int value) {
        this.value = value;
    }

    /**
     * Метод toDouble() преобразует значение объекта IntegerValue в дробное число.
     * @return значение объекта как дробное число
     */
    @Override
    public double toDouble() {
        return value;
    }
}

