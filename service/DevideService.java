package service;

import model.ComplexNumber;

public class DevideService implements calculate{

    private Loggable logger = new LoggerConsole();

    @Override
    public ComplexNumber getCalculate(ComplexNumber z1, ComplexNumber z2) {
        
        ComplexNumber result = new ComplexNumber();
        logger.log("Выбрана операция Деления: z1 / z2 = " + "(" + z1 + ")" + " / " + "(" + z2 + ")" + "= ...");
        result.real = ((z1.real * z2.real) + (z1.imagenary * z2.imagenary)) + ((z1.imagenary * z2.real) - (z1.real * z2.imagenary));
        result.imagenary = ((z2.real * z2.real) + (z2.imagenary * z2.imagenary));
        logger.log("Операция выполнена успешно, результат: ");
        return result;
    }

}
