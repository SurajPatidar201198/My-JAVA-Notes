
public class p2 {
    static int a;
    static int b;
    static void swap(int c,int d)
    {
        int temp=c;
        a=d;
        b=temp;
        // System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        a = 10;
        b = 30;
        swap(a,b);
        System.out.println(a+" "+b);
    }
}
