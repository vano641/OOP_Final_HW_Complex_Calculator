package service;

import model.ComplexNumber;

public class CreateComplexNumber {

    public ComplexNumber create(int real, int imagenary){
        return new ComplexNumber(real, imagenary);
    }
}
