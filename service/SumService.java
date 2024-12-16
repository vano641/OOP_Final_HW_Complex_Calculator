package service;

import model.ComplexNumber;

public class SumService implements calculate{

    private Loggable logger = new LoggerConsole();

    @Override
    public ComplexNumber getCalculate(ComplexNumber z1, ComplexNumber z2) {
        ComplexNumber result = new ComplexNumber();
        logger.log("Выбрана операция Сложения: z1 + z2 = " + "(" + z1 + ")" + " + " + "(" + z2 + ")" + "= ...");
        result.real = z1.real + z2.real;
        result.imagenary = z1.imagenary + z2.imagenary;
        logger.log("Операция выполнена успешно, результат: ");
        return result;
        } 
}
