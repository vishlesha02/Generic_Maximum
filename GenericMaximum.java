package Day9;

import java.util.Scanner;

    public class GenericMaximum <T> {
        public T a;
        public T b;
        public T c;

        public <T extends Comparable<T>> T TestMaximumUC5(T a, T b, T c) {

            T x = a;
            T y = b;
            T z = c;
            T max = a;

            if (b.compareTo(max) > 0)
                max = b;

            if (c.compareTo(max) > 0)
                max = c;

            return max;
        }

        Scanner sc = new Scanner(System.in);

        public void findMax(int n) {
            if (n == 1) {
                System.out.println("Enter three integer");
                int number1 = sc.nextInt();
                int number2 = sc.nextInt();
                int number3 = sc.nextInt();
                System.out.println("The maximum value is : " + TestMaximumUC5(number1, number2, number3));
            } else if (n == 2) {
                System.out.println("Enter three float");
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();
                float num3 = sc.nextFloat();
                System.out.println("The maximum value is : " + TestMaximumUC5(num1, num2, num3));
            } else if (n == 3) {
                System.out.println("Enter three integer");
                String name1 = sc.next();
                String name2 = sc.next();
                String name3 = sc.next();
                System.out.println("The maximum value is : " + TestMaximumUC5(name1, name2, name3));

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
