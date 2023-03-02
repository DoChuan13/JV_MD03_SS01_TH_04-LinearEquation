package ThucHanh;

import java.util.Scanner;

public class ThucHanh04 {
    public static void main(String[] args) {
        //function: ax + b = c;
        System.out.println("Linear Equation Resolver ");
        System.out.println("Given a  equation 'ax + b = c', please enter constant");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a: ");
        double a = scanner.nextDouble();
        System.out.println(" Enter b: ");
        double b = scanner.nextDouble();
        System.out.println(" Enter c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Equation pass with: x = " + x);
        } else if (b==c) {
            System.out.println("The solution is all x");
        }else {
            System.out.println("No solution");
        }
    }
}
