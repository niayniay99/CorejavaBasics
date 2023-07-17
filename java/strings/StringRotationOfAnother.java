package java.strings;

import java.util.Scanner;

public class StringRotationOfAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new String : ");
        String str1 = sc.nextLine().trim();
        System.out.println("Enter String 2 : ");
        String str2 = sc.nextLine().trim();

        if(checkStringRotation(str1,str2))
            System.out.println("String 2 is rotation of String 1");
        else
            System.out.println("No String 2 is NOT a rotation of String 1");
    }

    private static boolean checkStringRotation(String str1, String str2)
    {
        if(str1 == null || str2 == null)
            return false;
        if(str1.length() != str2.length())
            return false;

        // add string 1 with String 1 itself
        // it helps to identify it's rotation
        str1 = str1 + str1;

        if(str1.contains(str2))
            return true;

        return false;
    }
}
