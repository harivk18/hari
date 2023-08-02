import java.util.*;
public class Main{
    public static void Series(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                   System.out.print(s2.charAt(j)+" ");      // o/p = 3
                }
            }
        }
    }
        
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();                          //123
        String s2 = s.nextLine();                          //345
        Series(s1,s2);
    }
    
}
