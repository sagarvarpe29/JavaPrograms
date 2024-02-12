import java.util.Scanner;

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