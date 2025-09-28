import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter 1 for ascending check, 2 for descending check:");
        int choice = sc.nextInt();

        if(choice == 1){
            boolean isAscSorted = true;
            for(int i = 0; i < n-1; i++){
                if(arr[i] > arr[i+1]){
                    isAscSorted = false;
                    break;
                }
            }
            if(isAscSorted){
                System.out.println("Array is sorted in ascending order");
            } else {
                System.out.println("Array is not sorted in ascending order");
            }
        } else if(choice == 2){
            boolean isDesSorted = true;
            for(int i = 0; i < n-1; i++){
                if(arr[i] < arr[i+1]){
                    isDesSorted = false;
                    break;
                }
            }
            if(isDesSorted){
                System.out.println("Array is sorted in descending order");
            } else {
                System.out.println("Array is not sorted in descending order");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
