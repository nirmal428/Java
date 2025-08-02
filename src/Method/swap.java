package Method;

public class swap {
    public static void main(String[] args) {
        int a=5;
        System.out.println("a = "+a);
        int b=10;
        System.out.println("b = "+b);
        swapVal(a,b);

    }
    public static void swapVal(int a , int b ){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap the values :- ");
        System.out.println("a = " +a);
        System.out.println("b = "+b);
    }
}
