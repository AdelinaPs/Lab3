package ru.pshenichnikova.geometry;

// Определение класса Dot3d, который расширяет класс Dot
public class Dot3d extends Dot {
    // Приватное поле для хранения координаты z
    private int z;

    // Конструктор класса Dot3d, принимающий три параметра (x, y, z)
    public Dot3d(int x, int y, int z) {
        // Вызов конструктора базового класса Dot с параметрами x и y
        super(x, y);
        // Инициализация приватного поля z
        this.z = z;
    }

    // Геттер для получения значения поля z
    public int getZ() {
        // Возвращает значение поля z
        return z;
    }

    // Сеттер для установки значения поля z
    public void setZ(int z) {
        // Устанавливает новое значение для поля z
        this.z = z;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        // Возвращает строку в формате "{x, y, z}", где x и y берутся из базового класса,
        // а z берется из текущего объекта
        return "{%d, %d, %d}".formatted(getX(), getY(), z);
    }
}

