import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    temp = a[j];
                    System.out.print(temp+" ");
                }
            }
        }
    }
}
