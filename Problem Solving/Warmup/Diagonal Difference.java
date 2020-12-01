/*
    Diagonal Difference
*/
import java.io.*;
import java.util.*;
class Solution{
    public static int diagonalDifference(int[][] arr){
        int n= arr.length; //row count
        int m=arr[0].length;//column count
        int left_diagonal=0,right_diagonal=0,sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                  if(i==j){
                      left_diagonal += arr[i][j];
                  }if(i == n-j-1){
                      right_diagonal+=arr[i][j];
                  }      
            }
        }
        sum = Math.abs(left_diagonal - right_diagonal);
        return sum;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m=n;
        int result = 0;
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        result = diagonalDifference(arr);
        System.out.println(result);
    }
}

/*
Sample Input
    3
    11 2 4
    4 5 6
    10 8 -12
Sample Output
    15
*/