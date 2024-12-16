import view.ViewComplexCalculator;

/**
 * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление). 
 * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования.
 * 
 * 1) Отдельный класс сервис для каждого арифметического действия.
 * 
 * 2) Создать метод Вывода в консоль результата 
 */
public class main {

    public static void main(String[] args) {

        ViewComplexCalculator viewCalculator = new ViewComplexCalculator();
        viewCalculator.run();
        
    }
}