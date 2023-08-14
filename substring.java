import java.util.*;
public class MyClass {
    public static void substring(String str){
        int n = str.length();
        for(int len=1;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      substring(str);
    }
}
