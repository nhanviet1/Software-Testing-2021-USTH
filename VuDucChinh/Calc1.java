public class Calc1
{
    static public int add (int a, int b)
    {
        return a + b;
    }

    public static int sub(int a, int b)
    {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }


    public static int div(int a, int b) {
        if (b==0){
            throw new ArithmeticException("divide by zero");
        }
        return a / b;
    }
}
