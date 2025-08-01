package Operator;

public class Unary {
    public static void main(String[] args) {
        int x=10;
        int y= -x;
        int z= -y;
        System.out.println(y);
        System.out.println(z);

        int a=50;
        a +=1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int p = 5;
        System.out.println(--p);
        System.out.println(p);

        System.out.println(p--);
        System.out.println(p);
    }
}
