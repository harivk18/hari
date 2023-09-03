import java.util.*;
public class Main{
    public static void largestelement(int n,int a[]){
        int e1[] = new int[n];
        int e2[] = new int[n],j=0,k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                e1[j] = a[i];
                j++;
            }
            else
            {
                e2[k] = a[i];
                k++;
            }
        }
        e1[j]='\0';
        e2[k]='\0';
        Arrays.sort(e1);
        Arrays.sort(e2);
        System.out.print(e1[e1.length-2] + e2[e2.length-2]);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n]; 
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        largestelement(n,a);
    }
}
