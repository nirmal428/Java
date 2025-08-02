package Method;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        sumNum(a,b); // argument or actual parameter
    }
    public static void sumNum(int num1 , int num2){ // formal parameter
        int sum = num1+num2;
        System.out.println("Sun of the number " +sum);
    }
}
