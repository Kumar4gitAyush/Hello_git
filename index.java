
class Fibo
{
    static int fibbo(int num)
    {
      if(num==1||num==0)
      return 0;
      else
      return (num-1)+(num-2);
    }
    
public static void main(String[] args) {
        
    System.out.println("This program prints the fibonacci series for up to five terms");
    fibbo(5);
}
}