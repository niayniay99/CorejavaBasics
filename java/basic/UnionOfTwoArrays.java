public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int array1[] = {17,23,31,14,25,26};
        int array2[] = {23,44,14,8,17};

        int unionArrayMaxLength = array1.length + array2.length;
        int unionArray[] = new int [unionArrayMaxLength];

        int k =0;

        for(int i = 0; i<array1.length;i++)
            unionArray[k] = array1[i];
            
    }
}
