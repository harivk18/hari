import java.util.*;
public class Main{
    public static void pattern(int n){
        int h = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("* ");
                }
                if(j==h && i!=h){
                    System.out.print("* ");
                }
                if(i!=j && j!=h){
                    System.out.print(" ");
                }
            }
            h--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    
}
