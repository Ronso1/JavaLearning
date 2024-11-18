public class MetanitTasksPart2Final {
    public static void main(String[] args) {
        int a[] = {1, 2 , 3};
        int b[][] = new int[][] {{1, 2, 3}, {4, 5, 6}};
        sum("Test: ", 1, 2, 3, 4, 5, 6, 234, 535);
        System.out.println(a[2]);
        System.out.println(b[1][1]);
    }

    static void sum(String message, int ...nums) {

        System.out.print(message);
        int result =0;
        for(int x:nums)
            result+=x;
        System.out.println(result);
    }

    
}