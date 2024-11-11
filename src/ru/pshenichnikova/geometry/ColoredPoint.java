package ru.pshenichnikova.geometry;

/**
 * Класс ColoredPoint расширяет класс Dots и представляет цветной точку на плоскости.
 */
public class ColoredPoint extends Dots {
    /**
     * Поля класса:
     * - color: финальное поле типа String для хранения цвета точки.
     */
    private final String color;

    /**
     * Конструктор по умолчанию для создания объекта ColoredPoint.
     * @param x координата X точки
     * @param y координата Y точки
     * @param color цвет точки
     */
    public ColoredPoint(int x, int y, String color) {
        // Вызываем конструктор суперкласса (Dots) с параметрами x и y
        super(x, y);
        // Инициализируем поле color значением переданного параметра
        this.color = color;
    }

    /**
     * Альтернативный конструктор для создания объекта ColoredPoint с дополнительным параметром z.
     * @param x координата X точки
     * @param y координата Y точки
     * @param z координата Z точки
     * @param color цвет точки
     */
    public ColoredPoint(int x, int y, Integer z, String color) {
        // Вызываем конструктор суперкласса (Dots) с тремя параметрами x, y и z
        super(x, y, z);
        // Инициализируем поле color значением переданного параметра
        this.color = color;
    }

    /**
     * Геттер метод для получения цвета точки.
     * @return значение поля color
     */
    public String getColor() {
        return color;
    }

    /**
     * Переопределенный метод toString() для форматирования вывода информации о точке.
     * @return строковое представление объекта в формате "суперстрока + , color: цвет"
     */
    @Override
    public String toString() {
        return super.toString() + ", color: " + color;
    }
}
