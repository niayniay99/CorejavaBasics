package java.strings;


import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String s1 = sc.nextLine().trim();
        if(s1.length() == 0)
        {
            System.out.println("Number of Words : 0");
            System.exit(0);
        }   
        System.out.println("Number of Words : "+countWords(s1));
        sc.close();
    }

    public static int countWords(String s1)
    {
        int count = 1;
        for(int i =0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            System.out.println(ch);
            if(ch == ' ' || ch == '\t' || ch == '\n')
            {
                count++;
                ch = s1.charAt(i+1);
                while(ch == ' ' || ch == '\t' || ch == '\n'){
                    i++;
                    ch = s1.charAt(i+1);

                }
            }
        }
        return count;
    }
}
