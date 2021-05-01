import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day28 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       
       Pattern p = Pattern.compile(".+@gmail\\.com");
       Matcher m;
       List<String> Name = new ArrayList<>();
       
       for(int i=0; i < N; i++){
           String firstname = sc.next();
           String email = sc.next();
           
           m = p.matcher(email);
           if(m.matches()){
               Name.add(firstname);
           }
       }
       
       Collections.sort(Name);
       for(String fname : Name){
           System.out.println(fname);
       }
    }
}
