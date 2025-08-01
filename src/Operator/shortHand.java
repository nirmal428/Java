package Operator;

import java.util.Scanner;

public class shortHand {
    public static void main(String[] args) {
        int x=5;
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        x+=a;
        int b = sc.nextInt();
        x+=b;
        int c = sc.nextInt();
        x+=c;
        int d = sc.nextInt();
        x+=d;
        System.out.println(x);
    }
}
