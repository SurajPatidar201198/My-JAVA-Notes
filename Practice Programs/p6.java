import javax.lang.model.util.ElementScanner14;

//defining customized exceptions 

class TooYoungException extends RuntimeException
{
    TooYoungException(String s)
    {
        super(s);
    }
}
class TooOldException extends RuntimeException
{
    TooOldException(String s)
    {
        super(s);
    }
}
class CustomExceptionDemo
{
    // static int x = 10/0;
    public static void main(String[] args) {
        int i = Integer.parseInt(10);
        System.out.println(i);
        int j = Integer.parseInt("ten");
        System.out.println(j);
    }
}