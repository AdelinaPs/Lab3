package ru.pshenichnikova.geometry;

/**
 * Абстрактный класс Dots представляет собой точку или набор точек в трехмерном пространстве.
 */
public class Dots {
    /**
     * Х - координата точки на оси X.
     */
    private final int x;

    /**
     * Y - координата точки на оси Y.
     */
    private final int y;

    /**
     * Z - координата точки на оси Z (опционально).
     * Используется для представления точек с тремя координатами.
     */
    private final Integer z;

    /**
     * Конструктор по умолчанию, создает точку с двумя координатами.
     *
     * @param x координата X
     * @param y координата Y
     */
    public Dots(int x, int y) {
        this(x, y, null); // Вызываем конструктор с тремя параметрами
    }

    /**
     * Конструктор для создания точки с тремя координатами.
     *
     * @param x координата X
     * @param y координата Y
     * @param z опциональная координата Z
     */
    public Dots(int x, int y, Integer z) {
        this.x = x;      // Устанавливаем значение x
        this.y = y;      // Устанавливаем значение y
        this.z = z;      // Устанавливаем значение z (null, если не указан)
    }

    /**
     * Возвращает значение координаты X.
     *
     * @return значение координаты X
     */
    public int getX() {
        return x;
    }

    /**
     * Возвращает значение координаты Y.
     *
     * @return значение координаты Y
     */
    public int getY() {
        return y;
    }

    /**
     * Возвращает значение координаты Z, если она определена.
     *
     * @return значение координаты Z или null, если не установлена
     */
    public Integer getZ() {
        return z;
    }

    /**
     * Переопределяет метод toString() для корректного отображения объекта Dots.
     *
     * @return строковое представление объекта Dots
     */
    @Override
    public String toString() {
        return z == null ? String.format("{%d, %d}", x, y) :
                String.format("{%d, %d, %d}", x, y, z); // Форматируем строку в зависимости от наличия третьей координаты
    }
}
