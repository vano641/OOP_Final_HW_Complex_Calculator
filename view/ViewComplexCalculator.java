package view;

import java.util.Scanner;

import model.ComplexNumber;
import service.CalculateController;
import service.CreateComplexNumber;

public class ViewComplexCalculator {

    private CreateComplexNumber createNumber = new CreateComplexNumber();

    private CalculateController controller = new CalculateController();

    public void run(){

        while (true) {
            System.out.println("Введите комплексное число z1: ");

            int real = printInt("Введите действительное число: ");
            int imagenary = printInt("Введите мнимое число: ");
            ComplexNumber z1 = createNumber.create(real, imagenary);
            System.out.println("z1 = " + z1);

            System.out.println("Введите комплексное число z2: ");

            real = printInt("Введите действительное число: ");
            imagenary = printInt("Введите мнимое число: ");
            ComplexNumber z2 = createNumber.create(real, imagenary);
            System.out.println("z2 = " + z2);

            ComplexNumber result;
            

            while (true) {
                String comand = printString("Выберете команду(+, -, *): ");
                if (comand.equals("+")) {
                   result =  controller.getSum(z1, z2);
                   System.out.println(result);
                   break;
                }

                if (comand.equals("-")) {
                    result = controller.getSubstract(z1, z2);
                    System.out.println(result);
                    break;
                }

                if (comand.equals("*")) {
                    result = controller.getMultiply(z1, z2);
                    System.out.println(result);
                    break;
                }
            }
            break;
        }
    }

    private String printString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int printInt(String message) {
        System.out.print(message);
        Scanner value = new Scanner(System.in);
        int value_int = value.nextInt();
        return value_int;
    }
}
