package java.strings;


import java.util.Scanner;

public class SubsetsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine().trim();
        subsetOfString(str);
        sc.close();
    }    

    public static void subsetOfString(String str)
    {
        char array[] = str.toCharArray();
        int visited[] = new int[array.length];
        traverse(array,visited,0);
    }
    
    public static void traverse(char[] array, int[] visited, int curIndex)
    {
        System.out.print("\n {");
        for(int i =0;i<visited.length;i++)
            if(visited[i] == 1)
                System.out.print(array[i]+" ");
            System.out.print("}");

            for(int j =curIndex;j<array.length;j++)
            {
                visited[j] = 1;
                traverse(array, visited, j+1);
                visited[j] = 0;
            }
            
    }
}
