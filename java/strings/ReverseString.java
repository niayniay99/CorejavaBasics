package java.strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String reversedString = reverseString(str);
        System.out.println("Reversed String is "+reversedString);
    }

    public static String reverseString(String str)
    {
        char[] charArray = str.toCharArray();
        int j = charArray.length -1;
        for(int i = 0;i< charArray.length/2; i++,j--){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        
        return new String(charArray);

    }
}
