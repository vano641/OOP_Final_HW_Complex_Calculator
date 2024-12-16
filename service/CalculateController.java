package service;

import model.ComplexNumber;

public class CalculateController {

    SumService addition = new SumService(); // экземпляр сервиса Сложения

    SubstractionService subtraction = new SubstractionService(); // экземпляр сервиса Вычитания

    MultiplyService multiply = new MultiplyService();

    CreateComplexNumber number = new CreateComplexNumber(); // экземпляр Создания комплексного числа

// Метод сложения
    public ComplexNumber getSum(ComplexNumber z1, ComplexNumber z2){
        ComplexNumber result = addition.getCalculate(z1, z2);
        return result;
    }

// Метод Вычитания
    public ComplexNumber getSubstract(ComplexNumber z1, ComplexNumber z2){
        ComplexNumber result = subtraction.getCalculate(z1, z2);
        return result;
    }

// Метод Умножения
    public ComplexNumber getMultiply(ComplexNumber z1, ComplexNumber z2) {
        ComplexNumber result = multiply.getCalculate(z1, z2);
        return result;
    }
}
