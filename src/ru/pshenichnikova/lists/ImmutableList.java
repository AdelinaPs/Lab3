package ru.pshenichnikova.lists;


import java.util.Arrays;
import java.util.List;

public class ImmutableList {
    // Поле для хранения неизменяемого массива значений
    private final int[] values;

    /**
     * Конструктор для создания неизменяемого списка из массива целых чисел.
     * Создает копию переданного массива и сохраняет ее в поле values.
     */
    public ImmutableList(int... values) {
        // Создаем копию переданного массива с помощью Arrays.copyOf
        this.values = Arrays.copyOf(values, values.length);
    }

    /**
     * Конструктор для создания неизменяемого списка из List<Integer>.
     * Преобразует список в массив целых чисел и сохраняет его в поле values.
     */
    public ImmutableList(List<Integer> list) {
        // Используем stream() для преобразования List в IntStream
        // mapToInt() для преобразования Integer в int
        // toArray() для создания массива из IntStream
        this.values = list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Возвращает значение по указанному индексу.
     * Выбрасывает IndexOutOfBoundsException, если индекс вне допустимого диапазона.
     */
    public int get(int index) {
        // Проверяем, что индекс неотрицательен и меньше длины массива
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        // Возвращаем значение по указанному индексу
        return values[index];
    }

    /**
     * Устанавливает новое значение по указанному индексу.
     * Создает новый неизменяемый список с измененным значением.
     */
    public ImmutableList set(int index, int newValue) {
        // Проверяем, что индекс неотрицательен и меньше длины массива
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        // Создаем копию текущего массива
        int[] newValues = Arrays.copyOf(values, values.length);
        // Заменяем значение по указанному индексу новым значением
        newValues[index] = newValue;
        // Возвращаем новый неизменяемый список
        return new ImmutableList(newValues);
    }

    /**
     * Возвращает строковое представление значения массива.
     */
    @Override
    public String toString() {
        // Используем Arrays.toString для преобразования массива в строку
        return Arrays.toString(values);
    }

    /**
     * Проверяет, является ли список пустым.
     * @return true, если список пустой, иначе false
     */
    public boolean isEmpty() {
        // Сравниваем длину массива со значением 0
        return values.length == 0;
    }

    /**
     * Возвращает количество элементов в списке.
     * @return количество элементов в списке
     */
    public int size() {
        // Возвращаем длину массива
        return values.length;
    }

    /**
     * Преобразует список в обычный массив целых чисел.
     * @return массив целых чисел
     */
    public int[] toArray() {
        // Создаем копию массива с помощью Arrays.copyOf
        return Arrays.copyOf(values, values.length);
    }

}
