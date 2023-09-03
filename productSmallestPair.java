import java.util.*;
public class Main{
    public static void productsum(int n,int a[],int sum){
        Arrays.sort(a);
        int check = a[0]+a[1];
        if(check<sum){
            System.out.print(a[0]*a[1]);
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int sum = s.nextInt();
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        productsum(n,a,sum);
    } 
}
