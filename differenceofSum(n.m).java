import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int m = s.nextInt();
      int n = s.nextInt();
      int sum1 = 0;
      int sum2 = 0;
      for(int i=1;i<=n;i++){
          if(i%m==0)
            sum1 = sum1+i;
            
          if(i%m!=0)
            sum2 = sum2+i;
      }
      System.out.print(sum2 - sum1);
    }
}
