import java.util.*;
public class MyClass {
    public static void ValidatePassword(String str){
        char ch[] = str.toCharArray();
        int lc=0,uc=0,nc=0,sc=0;
        int count=0;
        if(str.length()>=8 && str.length()<=20)
            count++;
        for(int i=0;i<str.length();i++){
            if(ch[i]>='0' && ch[i]<='9')
                nc++;
            else if(ch[i]>='a' && ch[i]<='z')
                lc++;
            else if(ch[i]>='A' && ch[i]<='Z')
                uc++;
            else if(ch[i]!=27)
                sc++;
        }
        if(lc>=1 && uc>=1 && nc>=1 && count>0 && sc>=1)
            System.out.print("valid");
        else
            System.out.print("not valid");
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        ValidatePassword(str);
    }
}
