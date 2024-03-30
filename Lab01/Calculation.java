import java.util.*;
import java.lang.Math;
public class Calculation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        double num1 = sc.nextDouble();
        System.out.print("Enter num2:");
        double num2 = sc.nextDouble();
        System.out.println("Sum: " + (num1+num2));
        System.out.println("Difference:" + Math.abs((num1-num2)));
        System.out.println("Product:" + (num1*num2));
        System.out.println("Quotient:" + (num1/num2));
    }
}
