import java.util.*;
public class Main {
    public static int Armstrong(int n){
        int c = digitcount(n);
        int sum = 0;
        while(n!=0){
            int k = n % 10;
            int p = pow(k,c);
            sum = sum + p;
            n = n / 10;
        }
        return sum;
    }
    public static int digitcount(int n){
        int count = 0;
        while(n!=0){
            int k = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
    public static int pow(int a,int b){
        int res = 1;
        for(int i=1;i<=b;i++){
            res = res * a;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = Armstrong(n);
        if(res == n){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
