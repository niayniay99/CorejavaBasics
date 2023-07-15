package java.strings;


public class CountVowels {
    public static void main(String[] args) {
        String str = "lime";
        int count = 0;

        System.out.println("Given String is : "+str);
        str = str.toLowerCase();
        for(char ch : str.toCharArray())
        {
            switch(ch)
            {
                case 'a' :
                case 'e' :
                case 'i' : 
                case 'o' :
                case 'u' :
                    count++;
                    break;
                default:
                    break;


            }
        }
        System.out.println("Number of Vowels are "+count);
    }
}
