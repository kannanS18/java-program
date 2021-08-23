import java.util.*;
 class Prime  {

  public static void main(String[] args) {

    Scanner num=new Scanner(System.in);
    System.out.println("enter num") ;
    int n=num.nextInt(); 
    boolean flag = false;
    for (int i = 2; i <= n/ 2; ++i) {
      
      if (n % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
  }
}