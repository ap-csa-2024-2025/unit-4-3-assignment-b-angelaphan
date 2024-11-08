import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // You can test your method here
    // System.out.println(isPrime(1));
    // System.out.println(isPrime(17));
    System.out.println(isPrime(1));
    System.out.println(isPrime(17));
  }

  public static boolean isPrime(int N)
  {
    // TODO: Replace and write your code below
    int divisor = 2;
    if (N==1)
      {
        return false;
      }
    while (divisor < N)
    {
      if (N%divisor==0)
      {
        return false;
      }
      divisor++;
    }
    return true;
  }
}
