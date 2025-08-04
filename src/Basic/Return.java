package Basic;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int a= input();
        int b= input();
        int sum =a+b;
        System.out.print("Sum od a and b = "+ sum);
    }
    public static void greet(){
        System.out.println("Perform Additional Operation ");
    }
    public static int input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int number= sc.nextInt();
        return number;
    }
}
