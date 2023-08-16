import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = "applel";
        char a[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(a[i]==a[j]){
                    a[i]='-';
                    a[j]='-';
                }
            }
        }
        for(int i=0;i<str.length();i++){
            if(a[i]!='-')
                System.out.print(a[i]);
        }
    }
}

//output:  ae
