package java.strings;

public class Palindrome {
    public static void main(String[] args) {
        String word = "malyalam";

        System.out.println("The Given String \" "+word+"\" ");
        if(checkPalindrome(word))
        System.out.println("Yes the given string is a palindrome");
        else
            System.out.println("No, The given string is NOT a Palindrome.");

    }

    private static boolean checkPalindrome(String str)
    {
        int strlen = str.length();
        for(int i = 0; i < strlen/2 ; i++)
            if(str.charAt(i) != str.charAt(strlen - i -1))
                return false;
            return true;
    }
}
