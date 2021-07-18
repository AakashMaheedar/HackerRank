import java.util.*;
class SimpleArraySum{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        int sum = 0;
        for(int i = 0;i<arrayLength;i++){
            sum+=scan.nextInt();
        }
        System.out.println(sum);
    }
}