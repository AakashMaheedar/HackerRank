/*
    A Very Big Sum
*/
import java.util.*;
class Solution{
     static int simpleArraySum(int[] ar) {
       int sum = 0;
       for(int i =0 ;i < ar.length ;i++){
           sum+=ar[i];
       }
        return sum;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0; 
        int ar[] = new int[n];
        for(int i=0 ;i<n;i++){
            ar[i] = scan.nextInt();
        }
       sum = simpleArraySum(ar);
       System.out.println(sum);
    }
}

/*
Sample Input
    5
    1000000001 1000000002 1000000003 1000000004 1000000005
Output
    5000000015

*/