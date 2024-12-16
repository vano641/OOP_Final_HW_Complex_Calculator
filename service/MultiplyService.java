package service;

import model.ComplexNumber;

public class MultiplyService implements calculate{

    @Override
    public ComplexNumber getCalculate(ComplexNumber z1, ComplexNumber z2) {
        ComplexNumber result = new ComplexNumber();
        result.real = (z1.real * z2.real) - (z1.imagenary * z2.imagenary);
        result.imagenary = (z1.imagenary * z2.real) + (z1.real * z2.imagenary);
        return result;
    }

}
