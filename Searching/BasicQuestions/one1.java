import java.util.*;
public class one1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int larg = arr[0];
        int small = arr[0];
        for(int num : arr){
            if(num > larg){
                larg = num;
            }
            if(num < small){
                small = num;
            }
        }
        System.out.println("the largest element in the array is " + larg + " and smallest element in the array is "+small);
    }
}
