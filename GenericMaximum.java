package Day9;
import java.util.Scanner;
public class GenericMaximum {
    
    public void compare() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number 1 : ");
            float num1 = sc.nextFloat();

            System.out.println("Enter Number 2 : ");
            float num2 = sc.nextFloat();

            System.out.println("Enter Number 3 : ");
            float num3 = sc.nextFloat();

            float maxNum = 0.0F;
            if (num1 > num2 && num1 > num3) {
                maxNum = num1;
            } else if (num2 > num1 && num2 > num3) {
                maxNum = num2;
            } else if (num3 > num1 && num3 > num2) {
                maxNum = num3;
            }
            System.out.println("The maximum number = " + maxNum);
        }

        public static class Maximum {
            public static void main(String[] args) {

                GenericMaximum  t = new  GenericMaximum ();
                t.compare();
            }
        }
    }
