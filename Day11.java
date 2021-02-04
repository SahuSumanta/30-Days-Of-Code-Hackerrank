import java.util.*;
public class Day11 {
    //2dArrays
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int[][] arr = new int[6][6];

        for(int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
        }

        int result = Integer.MIN_VALUE;

        for(int i = 0; i < 6 - 2; i++)
            for (int j = 0; j < 6 - 2; j++) {
                sum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum2 = arr[i+1][j+1];
                sum3 = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                result = Math.max(result, sum1+sum2+sum3);
        }
        System.out.println(result);
        sc.close();
    }
}