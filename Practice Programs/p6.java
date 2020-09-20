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
    static
    {
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args) {
        // int age = Integer.parseInt(args[0]);
        // if(age>60)
        // {
        //     throw new TooYoungException("Please wait some more time you eill get best match");
        // }
        // else if(age<18)
        // {
        //     throw new TooOldException("Your age already crossed marriage age and no chance of getting marriage");
        // }
        // else 
        // {
        //     System.out.println("You will get matched details soon by email");
        // }
        
    }
}