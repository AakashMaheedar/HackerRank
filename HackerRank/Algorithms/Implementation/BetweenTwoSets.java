import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int gcdOfTwoNumber(int n1,int n2){
        if(n2 == 0)
           return n1;
        return gcdOfTwoNumber(n2,n1%n2); 
    }
    public static int lcmOfTwoNumber(int n1,int n2){
        int gcdValue = gcdOfTwoNumber(n1,n2);
        return Math.abs(n1 * n2) / gcdValue;
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        /*
            1)Fing LCM of all elements in List a
            2)Fing GCD of all elements in List b
            3)Count the number of multiples of LCM that are divisible by the GCD
        */
        //1)Fing LCM of all elements in List a
        int lcmOfAList = a.get(0);
        for(int i=1;i<a.size();i++){
            lcmOfAList = lcmOfTwoNumber(lcmOfAList,a.get(i)); 
        }
        //2)Fing GCD of all elements in List b
        int gcdOfBList = b.get(0);
        for(int i=1;i<b.size();i++){
            gcdOfBList = gcdOfTwoNumber(gcdOfBList,b.get(i)); 
        }
        
        //3)Count multiples of lcm that divide the gcd
        int multiples = 0 ;
        int resultCount = 0;
        while(multiples < gcdOfBList){
            multiples += lcmOfAList;
            
            if(gcdOfBList % multiples == 0){
                resultCount++;
            }
        }
        return resultCount;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
