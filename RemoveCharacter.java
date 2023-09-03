import java.util.*;
public class Main{
    public static void Replace(String str, char ch1, char ch2){
        char c[] = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==ch1){
                c[i]=ch2;
            }
            else if(c[i]==ch2){
                c[i]=ch1;
            }
            System.out.print(c[i]);
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch1 = s.next().charAt(0);
        char ch2 = s.next().charAt(0);
        Replace(str,ch1,ch2);
    }
}
