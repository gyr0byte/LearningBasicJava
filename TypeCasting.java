public class TypeCasting {
    public static void main(String[] args)
    {
    int a = 10;
    double b = a; // Implicit casting from int to double 
    System.out.println(a);
    System.out.println(b);
    double myval = 9.78;
    int myint = (int) myval; // Explicit or Forceful casting from double to int
    System.out.println(myval);
    System.out.println(myint);
    }
}