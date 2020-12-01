/*
    Compare the Triplets
*/
import java.io.*;
import java.util.*;
class Solution{
    static List<Integer> compareTriplets(List<Integer> a,List<Integer> b){
        int a_win=0,b_win=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)!=b.get(i)){
                if(a.get(i) > b.get(i)){
                a_win++;
                 }else if(a.get(i) < b.get(i)){
                b_win++;
                }
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(a_win);
        result.add(b_win);
        return result;
    }
    public static void main(String args[]){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<3;i++)
            list1.add(scan.nextInt());
        for(int i=0;i<3;i++)
            list2.add(scan.nextInt());
        result = compareTriplets(list1,list2);
        System.out.println(result.get(0)+" "+result.get(1));    

    }
}

/*
Sample Input 
    5 6 7
    3 6 10
Sample Output 
    1 1
*/