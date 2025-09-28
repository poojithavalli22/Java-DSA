

import java.util.Scanner;

public class four4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        /*
        for(int i = n-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
            */
            int start = 0;
            int end = n-1;
         while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
        }
             for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        }
    }
