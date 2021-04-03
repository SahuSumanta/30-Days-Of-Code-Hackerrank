package Gfg_practice_Set;

import java.util.Scanner;

public class Max_Min {
    private static Object myArray;
    //Max Method
    public int Max(int arr[]){
        int Max = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > Max){
                Max = arr[i];
            }
            return Max;
    }
    //Min Method
    public int Min(int arr[]){
        int Min = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < Min){
                Min = arr[i];
            }
            
        return Min;
    }
    //Maximum and minimum of an array using minimum number of comparisons
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int A[] = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = Sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(A[i]);
        }

        // int A[] = {95,25, 97, 24, 67, 100};
        Max_Min M = new Max_Min();
        System.out.println("Maximum value in the array is::"+M.Max(A));
        System.out.println("Maximum value in the array is::"+M.Min(A));
    Sc.close();
    }
    
}
