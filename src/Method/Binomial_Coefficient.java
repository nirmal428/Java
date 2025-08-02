package Method;

import java.util.Scanner;

public class Binomial_Coefficient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        int val=coefficient(n,r);
        System.out.println(val);
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int coefficient(int n ,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoff = fact_n/(fact_r*fact_nmr);
        return binCoff;
    }
}
