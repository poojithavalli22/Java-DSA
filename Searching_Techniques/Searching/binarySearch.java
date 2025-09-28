import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean found = false;
        Arrays.sort(a);
        int low = 0, high = a.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(key == a[mid]){
                System.out.println("Key found at "+mid);
                found = true;
                break;
            }
            else if(key > a[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(!found){
        System.out.println("key not found");
        }
    }
}
