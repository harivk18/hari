import java.util.*;
public class Main{
    public static void countwords(String str){
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        countwords(str);
    }
}
