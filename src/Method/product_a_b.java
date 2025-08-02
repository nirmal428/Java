package Method;

import java.util.Scanner;

public class product_a_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a= ");
        int a= sc.nextInt();
        System.out.print("b= ");
        int b= sc.nextInt();
        int val=product(a,b);
        System.out.println(val);
    }
    public static int product(int a , int b){
        int pro=a*b;
        return pro;
    }
}
