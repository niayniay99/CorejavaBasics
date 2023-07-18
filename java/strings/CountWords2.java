package java.strings;

import java.util.Scanner;

public class CountWords2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine().trim();

        String words[] = str.split("\\s");
        int wordCount = words.length;

        System.out.println("Number of Words : "+wordCount);
        sc.close();
    }
}
