import java.util.*;
public class MyClass {
    public static void BubbleSort(int n,int a[]){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        BubbleSort(n,a);
    }
}
