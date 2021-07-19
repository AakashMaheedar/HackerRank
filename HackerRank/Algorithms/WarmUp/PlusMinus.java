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

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int arrElementCount = arr.size();
        int negativeNumberCount = 0;
        int positiveNumberCount = 0;
        int zerosCount = 0;
        for(int i = 0;i< arrElementCount;i++){
            if(arr.get(i) < 0)
                negativeNumberCount++;
            else if(arr.get(i) > 0)
                positiveNumberCount++;
            else
               zerosCount++;
        }
        System.out.print(String.format("%.6g%n", (float)positiveNumberCount/arrElementCount ));
        System.out.print(String.format("%.6g%n", (float)negativeNumberCount/arrElementCount ));
        System.out.print(String.format("%.6g%n", (float)zerosCount/arrElementCount ));

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
