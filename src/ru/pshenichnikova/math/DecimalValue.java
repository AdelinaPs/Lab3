package ru.pshenichnikova.math;

/**
 * Класс DecimalValue представляет значение типа double и реализует интерфейс Summable.
 */
public class DecimalValue implements Summable {

    /**
     * Поле для хранения значения типа double.
     */
    private final double value;

    /**
     * Конструктор класса DecimalValue.
     *
     * @param value Значение типа double для инициализации объекта.
     */
    public DecimalValue(double value) {
        // Инициализирует поле value значением, переданным в качестве параметра.
        this.value = value;
    }

    /**
     * Метод toDouble() преобразует значение типа DecimalValue в тип double.
     *
     * @return Возвращает значение поля value как double.
     */
    @Override
    public double toDouble() {
        // Возвращает значение поля value без изменений.
        return value;
    }
}
