import java.util.*;
import java.util.Scanner;

public class six6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int seclarg = Integer.MIN_VALUE;
        int secsmall = Integer.MAX_VALUE;
        int larg = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > larg){
                seclarg = larg;
                larg = arr[i];
            }
            else if(arr[i] > seclarg && arr[i] != larg){
                seclarg = arr[i];
            }
            if(arr[i] < small){
                secsmall = small;
                small = arr[i];
            }
            else if(arr[i] < secsmall && arr[i] != small){
                secsmall = arr[i];
            }
        }
        System.out.println("Second largest : "+seclarg);
        System.out.println("Second smallest: "+secsmall);
    }
}
