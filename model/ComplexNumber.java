package model;

public class ComplexNumber {

    public int real;
    public int imagenary;

    public ComplexNumber() {
        this.real = real;
        this.imagenary = imagenary;
    }

    public ComplexNumber(int real, int imagenary) {
        this.real = real;
        this.imagenary = imagenary;
    }


    public int getReal() {
        return this.real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImagenary() {
        return this.imagenary;
    }

    public void setImagenary(int imagenary) {
        this.imagenary = imagenary;
    }

    @Override
    public String toString() {
        
        return "(" + real + ") + (" + imagenary + ")i";
    }

}
