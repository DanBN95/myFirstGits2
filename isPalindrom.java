//author: Dan Ben Natan
import java.lang.String;
import java.util.Scanner;

public class isPalindrom {
    public boolean flag=true;

    public static boolean isPal(String s){
        int size=s.length();
        int i=0;
        while(size>=i) {
            if (s.charAt(i) != s.charAt(size-1))
                return false;
            else {
                size--;
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String right=new String("susus");
        String wrong=new String("horse");
        boolean flag;
        flag=isPal(right);
        System.out.println("right string answer - "+flag);
        flag=isPal(wrong);
        System.out.println("wrong string answer - "+flag);

    }
}
