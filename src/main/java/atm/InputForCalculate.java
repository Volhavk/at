package atm;

import java.util.Scanner;

public class InputForCalculate {

    private double readInputNumber() {
        Scanner scanner = new Scanner(System.in);
        double i = 0;
        if (scanner.hasNextDouble()) {
            i = scanner.nextDouble();
        } else {
            System.out.println("Bla bla (?)");
        }
        return i;
    }

}
