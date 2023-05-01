package Day9;
import java.util.Scanner;
public class GenericMaximum {
    
    public void compare() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String a = sc.nextLine();

        System.out.println("Enter String 2 : ");
        String b = sc.nextLine();

        System.out.println("Enter String 3 : ");
        String c = sc.nextLine();

        int num1=a.compareTo(b);
        int num2=b.compareTo(c);
        int num3=c.compareTo(a);

        if ( num1 > num2 && num1 > num3 ) {
            System.out.println("The Biggest String is String 1: " + a);
        }
        else if(num2> num1 && num2 > num3){
            System.out.println("The Biggest String is String 2: " + b);
        }
        else if(num3 > num1 && num3 > num2)
        {
            System.out.println("The Biggest String is String 3: " + c);
        }
    }
    
    public static class Maximum {
        public static void main(String[] args) {

            GenericMaximum t = new GenericMaximum();
            t.compare();
        }
    }
    }
