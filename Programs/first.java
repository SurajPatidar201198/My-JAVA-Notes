package f1;
class second
{
    public void m1()
    {
        System.out.println("This is second of first");
    }
}
public class first {
    public static void main(String[] args) {
        second s= new second();
        s.m1();
    }
}
