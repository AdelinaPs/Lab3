package ru.pshenichnikova.geometry;

import java.util.Objects;

// Класс представляющий линию на координатной плоскости
public class Line {
    // Поля для хранения начальной и конечных точек линии
    private Dot start;
    private Dot end;

    // Конструктор с параметрами Dot
    public Line(Dot start, Dot end) {
        // Создаем новую точку для начала линии
        this.start = new Dot(start.getX(), start.getY());
        // Создаем новую точку для конца линии
        this.end = new Dot(end.getX(), end.getY());
    }

    // Конструктор с координатами x и y
    public Line(int x1, int y1, int x2, int y2) {
        // Создаем новый экземпляр Line с двумя конструкторами
        this(new Dot(x1, y1), new Dot(x2, y2));
    }

    // Метод для вычисления длины линии
    public int getLength() {
        // Вычитаем координаты конца из начала для получения разницы
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        // Используем формулу теоремы Пифагора для вычисления гипотенузы
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    // Метод для преобразования объекта в строку
    public String toString() {
        // Форматируем строку с использованием метода formatted
        return "Линия от %s до %s".formatted(start, end);
    }

    // Геттер для начальной точки
    public Dot getStart() {
        // Возвращаем новую точку, созданную на основе текущей
        return new Dot(start.getX(), start.getY());
    }

    // Сеттер для начальной точки
    public void setStart(Dot start) {
        // Устанавливаем новые координаты для начальной точки
        this.start = new Dot(start.getX(), start.getY());
    }

    // Геттер для конечной точки
    public Dot getEnd() {
        // Возвращаем новую точку, созданную на основе текущей
        return new Dot(end.getX(), end.getY());
    }

    // Сеттер для конечной точки
    public void setEnd(Dot end) {
        // Устанавливаем новые координаты для конечной точки
        this.end = new Dot(end.getX(), end.getY());
    }

    // Метод для установки координат начала линии
    public void setStartCoordinates(int x, int y) {
        // Устанавливаем новые координаты для начальной точки
        this.start.setX(x);
        this.start.setY(y);
    }

    // Метод для установки координат конца линии
    public void setEndCoordinates(int x, int y) {
        // Устанавливаем новые координаты для конечной точки
        this.end.setX(x);
        this.end.setY(y);
    }

    @Override
    // Метод для сравнения объекта на равенство
    public boolean equals(Object o) {
        // Проверяем, что это не тот же самый объект
        if (this == o) return true;
        // Проверяем, что объект не null и имеет тот же класс
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        // Сравниваем начальные и конечные точки
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    // Метод для вычисления хеш-кода объекта
    public int hashCode() {
        // Используем метод Objects.hash для вычисления хеш-кода
        return Objects.hash(start, end);
    }

    @Override
    // Метод для клонирования объекта
    public Line clone() {
        try {
            // Создаем новый экземпляр Line
            Line cloned = (Line) super.clone();
            // Копируем начальную точку
            cloned.start = new Dot(start.getX(), start.getY());
            // Копируем конечную точку
            cloned.end = new Dot(end.getX(), end.getY());
            // Возвращаем скопированный объект
            return cloned;
        } catch (CloneNotSupportedException e) {
            // Если возникнет исключение, выбрасываем AssertionError
            throw new AssertionError(); // просто так, все равно не вызовется
        }
    }
}
