//To find the minimum frequent character of a string
import java.util.*;
public class MinfrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }int min=Integer.MAX_VALUE;
        char f=' ';
        for(int i=0;i<26;i++){
            if(freq[i]>0&&freq[i]<min){
                min=freq[i];
                f=(char)(i+'a');
            }
        }System.out.println(f+" is the minimum frequent character of the string");
    }
}