import java.util.*;
public class two2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0, avg = 0;
        for(int num : arr){
            sum+=num;
        }
        avg = sum / n;
        System.out.println("The sum of elements in array is "+sum+" avg is "+avg);
}
}
