import java.util.Scanner;
import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        double[] a = new double[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            a[i] = sc.nextDouble();
        }

        Arrays.sort(a);

        System.out.println("Sorted array: " + Arrays.toString(a));
        double sum = 0;
        for (double num : a) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        double average = sum / n;
        System.out.println("Average value: " + average);

        sc.close();
    }
}
