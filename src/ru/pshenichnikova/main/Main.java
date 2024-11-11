//Вариант 1

package ru.pshenichnikova.main;

import ru.pshenichnikova.geometry.ColoredPoint;
import ru.pshenichnikova.geometry.Dot;
import ru.pshenichnikova.geometry.Dots;
import ru.pshenichnikova.geometry.Line;
import ru.pshenichnikova.lists.ImmutableList;
import ru.pshenichnikova.math.DecimalValue;
import ru.pshenichnikova.math.FractionValue;
import ru.pshenichnikova.math.IntegerValue;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static ru.pshenichnikova.math.SumCalculator.sum;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задание 1.6 и 6.3
        System.out.println("\n=========================================");
        System.out.println("Задание 1.6 и 6.3");
        System.out.println("=========================================\n");
        System.out.print("Введите x и y начала линии (через пробел): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Введите x и y конца линии (через пробел): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Dot start = new Dot(x1, y1);
        Dot end = new Dot(x2, y2);
        Line line1 = new Line(start, end);
        Line line2 = new Line(start, end);

        System.out.println(line1);
        System.out.println(line2);

        System.out.print("Введите x и y для изменения начала линии (через пробел): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        line1.setStartCoordinates(x3, y3);
        System.out.println(line1);

        System.out.print("Введите x и y для изменения конца линии (через пробел): ");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        line2.setEndCoordinates(x4, y4);
        System.out.println(line2);

        //Задание 2.1
        System.out.println("\n=========================================");
        System.out.println("Задание 2.1");
        System.out.println("=========================================\n");
        //Имеет массив целых чисел
        //С указанием значений в виде массива целых чисел
        ImmutableList list1 = new ImmutableList(new int[]{1, 2, 3, 4});
        System.out.println("List1: " + list1);

        //С указанием перечня чисел как независимых значений (через запятую)
        ImmutableList list2 = new ImmutableList(5, 6, 7, 8);
        System.out.println("List2: " + list2);

        //С указанием другого Списка, в этом случае копируются все значения указанного списка
        ImmutableList list3 = new ImmutableList(Arrays.asList(9, 10, 11, 12));
        System.out.println("List3: " + list3);

        //Получение значения из позиции N
        System.out.println("Значение по индексу 2 в List1: " + list1.get(2));

        ImmutableList list4 = list1.set(2, 99);
        System.out.println("List1 после set: " + list1);
        System.out.println("List4 после set: " + list4);

        //Можно проверить пуст Список или нет
        System.out.println("List1 пустой? " + list1.isEmpty());

        //Можно узнать текущий размер.
        System.out.println("Размер List1: " + list1.size());

        //Все хранящиеся значения можно запросить в виде стандартного массива.
        System.out.println("Массив List1: " + Arrays.toString(list1.toArray()));

        // Задание 3.5
        System.out.println("\n=========================================");
        System.out.println("Задание 3.5");
        System.out.println("=========================================\n");
        System.out.println("Точка с тремя координатами:");

        System.out.print("Введите координату X: ");
        int x = scanner.nextInt();

        System.out.print("Введите координату Y: ");
        int y = scanner.nextInt();

        System.out.print("Введите координату Z (если она есть): ");
        Integer z = scanner.nextInt();

        // Создаем точку Dots
        Dots dot = new Dots(x, y);

        // Выводим созданную точку
        //System.out.println("Созданная точка: " + dot);

        // Если координата Z была введена, создаем новую точку с тремя координатами
        if (z != null) {
            Dots dotWithZ = new Dots(x, y, z);
            System.out.println("Точка с тремя координатами: " + dotWithZ);
        }

        // Задание 4.5
        System.out.println("\n=========================================");
        System.out.println("Задание 4.5");
        System.out.println("=========================================\n");
        System.out.println("Введите координаты первой точки:");
        int x41 = scanner.nextInt();
        int y41 = scanner.nextInt();

        System.out.println("Введите координаты второй точки:");
        int x42 = scanner.nextInt();
        int y42 = scanner.nextInt();

        System.out.println("Введите координаты третьей точки:");
        int x43 = scanner.nextInt();
        int y43 = scanner.nextInt();

        System.out.println("Введите цвет первой точки:");
        String color1 = scanner.next();

        System.out.println("Введите цвет второй точки:");
        String color2 = scanner.next();

        System.out.println("Введите цвет третьей точки:");
        String color3 = scanner.next();

        Dot dot1 = new Dot(x41, y41);
        Dot dot2 = new Dot(x42, y42);
        ColoredPoint dot3 = new ColoredPoint(x43, y43, color3);

        System.out.println("Первая точка: " + dot1);
        System.out.println("Вторая точка: " + dot2);
        System.out.println("Третья точка: " + dot3);

        // Задание 5.1
        System.out.println("\n=========================================");
        System.out.println("Задание 5.1");
        System.out.println("=========================================\n");
        // Вычисляем сумму различных числовых значений
        double result1 = sum(new IntegerValue(2), new FractionValue(3, 5), new DecimalValue(2.3));
        double result2 = sum(new DecimalValue(3.6), new FractionValue(49, 12), new IntegerValue(3), new FractionValue(3, 2));
        double result3 = sum(new FractionValue(1, 3), new IntegerValue(1));

        System.out.println("Результат уравнения result1: " + result1);
        System.out.println("Результат уравнения result2: " + result2);
        System.out.println("Результат уравнения result3: " + result3);

        // Задание 7.3
        System.out.println("\n=========================================");
        System.out.println("Задание 7.3");
        System.out.println("=========================================\n");
// Проверяем количество входных аргументов
        if (args.length < 2) {
            System.out.println("Пожалуйста, предоставьте два числовых аргумента.");
            return; // Завершаем выполнение метода
        }

// Извлекаем строки аргументов из массива args
        String xStr = args[0];
        String yStr = args[1];

        try {
            double result = power(xStr, yStr); // Вычисляем степень числа
            System.out.println("Результат степени: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод: " + e.getMessage()); // Выводим сообщение об ошибке при неверном формате входных данных
        }
    }
    // Вычисляем степень числа
    public static double power(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }


}