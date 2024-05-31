import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Casio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one of the operation you wanna perform with these calculator:");
        System.out.println("1)Addition.\n2)Subtraction.\n3)Multiplication.\n4)Division.\n5)Unit Conversion.\n6)Sum of first n natural number.\n7)Multiplication Table.\n8)Paisa to Rupees Calculator.");
        System.out.print("\nOperation you wanna perform:");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("a + b=?");
            System.out.print("Enter the value of a=");
            double a = sc.nextInt();
            System.out.print("Enter the value of b=");
            double b = sc.nextInt();
            double sum = a + b;
            System.out.println("a + b=" + sum);

        } else if (op == 2) {
            System.out.println("a - b=?");
            System.out.print("Enter the value of a=");
            double a = sc.nextInt();
            System.out.print("Enter the value of b=");
            double b = sc.nextInt();
            double Difference = a - b;
            System.out.println("a - b=" + Difference);

        } else if (op == 3) {
            System.out.println("a*b=?");
            System.out.print("Enter the value of a=");
            double a = sc.nextInt();
            System.out.print("Enter the value of b=");
            double b = sc.nextInt();
            double Product = a * b;
            System.out.println("a*b=" + Product);

        } else if (op == 4) {
            System.out.println("a/b=?");
            System.out.print("Enter the value of a=");
            double a = sc.nextInt();
            System.out.print("Enter the value of b=");
            double b = sc.nextInt();
            double Quotient = a / b;
            System.out.println("a/b=" + Quotient);

        } else if (op == 5) {
            System.out.println("\nUnder Unit conversion:\n1)Millimeter(mm) to Centimeter(cm).\n2)cm to meter(m).\n3)m to kilometer(km).\n4)Gram(g) to Kilogram(kg)\n5)feet(ft) to cm\n6)Inch to cm.");
            System.out.print("\nConversion you want:");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Amm = Bcm");
                System.out.print("Enter the value of A in mm=");
                int A = sc.nextInt();
                System.out.print(A + "mm=");
                int B = A / 10;
                System.out.println(B + "cm");
            } else if (n == 2) {
                System.out.println("Acm = Bm");
                System.out.print("Enter the value of A in cm=");
                int A = sc.nextInt();
                System.out.print(A + "cm=");
                int B = A / 100;
                System.out.println(B + "m");
            } else if (n == 3) {
                System.out.println("Am = Bkm");
                System.out.print("Enter the value of A in m=");
                int A = sc.nextInt();
                System.out.print(A + "m=");
                int B = A / 1000;
                System.out.println(B + "km");
            } else if (n == 4) {
                System.out.println("Ag = Bkg");
                System.out.print("Enter the value of A in g=");
                int A = sc.nextInt();
                System.out.print(A + "g=");
                int B = A / 1000;
                System.out.println(B + "kg");
            } else if (n == 5) {
                System.out.println("Aft = Bcm");
                System.out.print("Enter the value of A in ft=");
                int A = sc.nextInt();
                System.out.print(A + "ft=");
                double B = A * 30.48;
                System.out.println(B + "cm");
            } else if (n == 6) {
                System.out.println("A inch = Bcm");
                System.out.print("Enter the value of A in inch=");
                int A = sc.nextInt();
                System.out.print(A + "inch=");
                double B = A * 2.54;
                System.out.println(B + "cm");
            } else {
                System.out.println("Error: Invalid operation.\nPlease try again.");
            }
        } else if (op == 6) {
            System.out.print("Enter the value of n:");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 0; i<=n; i++ ) {
                sum = sum + i;
            }
            // Printing the sum of first n natural numbers.
            System.out.println("The sum of first n natural numbers="+sum);
        } else if (op == 7) {
            System.out.println("Multiplication table of n.");
            System.out.print("\nEnter the value of n=");
            int n = sc.nextInt();
            System.out.println("Printing multiplication table of "+n);
            for(int i = 1; i<=10; i++ ) {
                int p = n*i;
                System.out.println(n+"*"+i+"="+p);
            }

        } else if (op == 8) {
            System.out.print("Enter the value in Paisa: ");
            int n = sc.nextInt();
            int r = n/100;
            int pp = n%100;
            System.out.println(n+"Paisa= "+r+" Rupees and "+pp+" paisa.");


        } else {
                System.out.println("Error: Invalid operation.\nPlease try again.");
            }



    }
}