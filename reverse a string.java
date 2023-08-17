import java.util.*;
public class MyClass {
    public static void reverse(String str){

        char ch[] = str.toCharArray();
        int count=0;
        for(int i=ch.length-1;i>=0;i--){
            if(i==0){
                for(int j=i;j<=(count+1);j++){
                   System.out.print(ch[j]);
                }
            }
            else if(ch[i]!=' '){
                count++;
            }
            else{
                for(int j=i+1;j<=(i+count);j++){
                    System.out.print(ch[j]);
                }
                System.out.print(" ");
                count=0;
            }
        }
    }
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      reverse(str);
    }
}
