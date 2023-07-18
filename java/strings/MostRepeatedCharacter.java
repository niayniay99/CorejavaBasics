package java.strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MostRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine().trim();

        HashMap<Character,Integer> charMap = new HashMap<>();

        for(Character c : str.toCharArray()){
            if(charMap.containsKey(c))
                charMap.put(c,charMap.get(c)+1);
                else
                    charMap.put(c,1);

        }
        int maxCount = 0;
        char mostRepeatedCharacter = 0;

        Set<Character> keySet = charMap.keySet();
        for(Character c :keySet){
            int value = charMap.get(c);
            if(maxCount < value){
                maxCount = value;
                mostRepeatedCharacter = c;
            }
        }

        System.out.println("Most Repeated Charater is  "+mostRepeatedCharacter);
        System.out.println("Repeated count is : "+maxCount);
        sc.close();


    }
}
