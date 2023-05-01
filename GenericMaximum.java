package Day9;

import java.util.Scanner;

public class GenericMaximum {

        public static <V extends Comparable<V>> V maximum(V a, V b, V c) {

            V max = a;

            if (b.compareTo(max) > 0)
                max = b;

            if (c.compareTo(max) > 0)
                max = c;

            return max;
        }

        Scanner sc = new Scanner(System.in);

        public void findMax(int n) {
            if (n == 1) {
                System.out.print("Enter first Number = ");
                int number1 = sc.nextInt();
                System.out.print("Enter second Number = ");
                int number2 = sc.nextInt();
                System.out.print("Enter third Number= ");
                int number3 = sc.nextInt();
                System.out.println("The maximum value is of : " + maximum("Number 1 : " + number1, "Number 2 : " + number2, "Number 3 : " + number3));
            } else if (n == 2) {
                System.out.print("Enter first Number = ");
                float number1 = sc.nextFloat();
                System.out.print("Enter second Number = ");
                float number2 = sc.nextFloat();
                System.out.print("Enter third Number = ");
                float number3 = sc.nextFloat();
                System.out.println("The maximum value is of : " + maximum("Number 1 : " + number1, "Number 2 : " + number2, "Number 3 : " + number3));
            } else if (n == 3) {
                System.out.print("Enter first String = ");
                String name1 = sc.next();
                System.out.print("Enter second String = ");
                String name2 = sc.next();
                System.out.print("Enter third String = ");
                String name3 = sc.next();
                System.out.println("The maximum value is of : " + maximum("String 1 : " + name1, "String 2 : " + name2, "Stirng 3 : " + name3));

            }
        }

        public static void main(String[] args) {

            GenericMaximum t = new GenericMaximum();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the following number to perform operations : \n 1 for int \n 2 for float \n 3 for String \n Press any Number to stop");
                int n = sc.nextInt();
                if (n == 1 || n == 2 || n == 3) {
                    t.findMax(n);
                } else {
                    break;
                }
            }
        }
    }
