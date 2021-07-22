/*
    Time Conversion

*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String times[] = s.split(":");
        String hour = times[0];
        String minutes= times[1];
        String seconds = times[2].substring(0,2);
        String caser = times[2].substring(2,4);
        String time = "";
        if(caser.equals("AM")){
            if(hour.equals("12")){
                hour = "00";
            }
            time = hour+":"+minutes+":"+seconds;
        }else{
            int hr = Integer.parseInt(hour);
            if(hr!= 12){
                hr +=12;
            }
            hour = ""+hr;
            time = hour+":"+minutes+":"+seconds;
        }
        
        return time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}


/*
Sample Input 0
  07:05:45PM
Sample Output 0
  19:05:45  
*/