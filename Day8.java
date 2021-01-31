//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Day8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer> Solution = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
           Solution.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(Solution.containsKey(s)){
                System.out.println(s+"="+Solution.get(s));
            }else{
                System.out.println("Not found");
            }
            
        }
        in.close();
    }
}