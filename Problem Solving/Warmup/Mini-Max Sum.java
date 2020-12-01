/*
    Mini-Max Sum
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        
        long min_sum =0 ;
        long max_sum =0;
        for(int i=0; i<arr.length; i++){
            if(i <arr.length -1 ){
                min_sum +=arr[i];
            }
            if(i>0){
                max_sum+=arr[i];
            }
        }
        System.out.println(min_sum + " " + max_sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

/*
Test case 1
    Sample Input
        1 2 3 4 5
    Sample Output
        10 14
Test case 2
    Input (stdin)
        7 69 2 221 8974
    Expected Output
        299 9271    
*/