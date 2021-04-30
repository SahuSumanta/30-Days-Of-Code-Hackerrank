import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day26 {

    public static void main(String[] args) {
        int fine=0;
    Scanner sc = new Scanner(System.in);
    int returnday = sc.nextInt();
    int returnmonth = sc.nextInt();
    int returnyear = sc.nextInt();

 
    int expectday = sc.nextInt();
    int expectmonth = sc.nextInt();
    int expectyear = sc.nextInt();


    if(returnyear < expectyear){   
        fine=0;
    }
    else{        
        if(returnyear > expectyear){   
            fine=10000;
        }else if(returnmonth > expectmonth){    
            fine=500 * (returnmonth - expectmonth);
        }else if(returnday > expectday){     
            fine=15 * (returnday - expectday);
        }
    }              
    System.out.println(fine);    
    }
}