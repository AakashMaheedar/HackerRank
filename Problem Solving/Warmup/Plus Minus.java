/*
    Plus Minus
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
        double arr_size = arr.length;
        double positives_count = 0;
        double negatives_count = 0;
        double zeros_count = 0 ;
        for(int i =0 ;i< arr_size ;i++ ){
            if(arr[i]>0){
                positives_count++;
            }else if(arr[i]<0){
                negatives_count++;
            }else{
                zeros_count++;
            }
        }
        System.out.println(positives_count/arr_size);
        System.out.println(negatives_count/arr_size);
        System.out.println(zeros_count/arr_size);
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

/*
Sample Input
    6
    -4 3 -9 0 4 1         
Sample Output
    0.500000
    0.333333
    0.166667

*/