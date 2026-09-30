//To reverse a given string
import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            rev=rev+c;
        }System.out.println(rev);
    }
}