import java.util.Scanner;

/**
 * This program is used to calculate the factorial of any given program.
 * For e.g : If you give number as 5, then that will be calculated as 1*2*3*4*5 = 120 and in the same way for any numbers.
 */
public class Factorial {
    
    public static void main(String[] args) {

        System.out.println("This is your Factorial program and now please enter your number to make factorial of it--->>");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Your entered number is  : "+ number);
        int fact = 1;
        for(int i=1;i<=number;i++){
              fact = fact * i;   
        }
        System.out.println("Factorial of given number is :"+  fact);
        sc.close();
    }
}