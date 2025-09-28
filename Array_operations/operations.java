//TRAVERSAL
//INSERTION AT SPECIFIC POSITION
//DELETING ELEMENT
//DELETING ELEMENT AT SPECIFIC POSITION

import java.util.*;
public class operations {
    public static void traversal(int a[],int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static int insert(int arr[], int position, int value, int n){
        for(int i = n; i > position; i--){
            arr[i] = arr[i-1];
        }
        arr[position] = value;
        n++;
        return n;
    }

    public static int delete(int arr[], int n, int del_pos){
        for(int i = del_pos; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        n--;
        return n;
    }

    public static int del_ele(int[] arr, int n, int ele){
        for(int i = 0; i < n; i++){
            if(arr[i] == ele){
                arr[i] = arr[i+1];
            }
        }
        n--;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in the elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        traversal(arr,n);
        //insertion of element in array at specific position
        System.out.println("Enter position");
        int pos=sc.nextInt();

        System.out.println("Enter value to insert");
        int val = sc.nextInt();

        n = insert(arr,pos, val, n);
        System.out.println("Elements After insertion: ");
        traversal(arr, n);

        //deleting at specific position

        System.out.println("Enter position you want to delete: ");
        int del_pos = sc.nextInt();
        n = delete(arr,n,del_pos);
        System.out.println("Elements in the array after deleting at specific position: ");
        traversal(arr, n);

        //deleting an element

        System.out.println("enter element you want to delete");
        int ele = sc.nextInt();
        n=del_ele(arr,n,ele);
        System.out.println("After deleting specific element:");
        traversal(arr, n);
    }
}
