package MaheshSan;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
Scanner sc=new Scanner(System.in);

    public void isAnagram()
    {
        System.out.println("Enter String 1");
        String s1=sc.next().toLowerCase(Locale.ROOT);
        System.out.println("Enter String 2");
        String s2=sc.next().toLowerCase(Locale.ROOT);

        char c[] = s1.toCharArray();
        char c1[]=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c);

        if(Arrays.toString(c).equals(Arrays.toString(c1)))
        {
            System.out.println("Yes given string are Anagram...");
        }
        else
        {
            System.out.println("The given strings are not anagram");
        }

    }
    public static void main(String[] args) {
        Anagram a =new Anagram();
        a.isAnagram();
    }
}
