package java.strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Anagram ::
  Two Strings are called as Anagrams if they contain same set of 
  characters but in different order
  String 1 : keep
  String 2 : peek
  String 1 & 2 are Anagrams
  String 2 have same set of characters but in different order
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String 1 : ");
        String str1 = sc.nextLine().trim();
        
        System.out.println("Enter String 2 : ");
        String str2 = sc.nextLine().trim();
        
        if(checkAnagram(str1,str2))
            System.out.println("Both Strings are Anagram");
        else
            System.out.println("Both Strings are NOT Anagram");
        sc.close();
    }

    static boolean checkAnagram(String str1, String str2)
    {
        //removing white spaces.
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if(str1.length() != str2.length())
            return false;

        //convert string to char array

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        //sort the array.
        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1,array2))
            return true;
        
        return false;        
    }
}
