import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {
    //Binary numbers


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count=0;
        int minCount = 0;
        
        while(n > 0){
            int rem = n % 2;
            if(rem == 1){
                count++;
                if(count > minCount){
                    minCount = count;
                }
            }else{
                count = 0;
            }
            n = n/2;
        }
        System.out.println(minCount);
    }
}
