import java.util.*;
public class Main{
    public static int[][] Circle(int n, int A[][]){
        int a=0,b=n-1,c=0,d=n-1,h=1,v=0;
        while(v<n/2){
            for(int i=a;i<=b;i++){
                A[c][i]=h;
                h++;
            }
            c++;
            for(int i=c;i<=d;i++){
                A[i][b]=h;
                h++;
            }
            b--;
            for(int i=b;i>=a;i--){
                A[d][i]=h;
                h++;
            }
            d--;
            for(int i=d;i>=c;i--){
                A[i][a]=h;
                h++;
            }
            a++;
            v++;
        }
        if(n%2!=0 && (c!=0 && a!=0)){
            System.out.print(A[c][a]=h);
        }
        return A;
    }
     
     
    public static void display(int A[][]){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(A[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[][] = new int[n][n];
        Circle(n,A);
        display(A);
    }
}
