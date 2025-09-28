
import java.util.*;
public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(a[i] == key){
                found = true;
                System.out.println("Key "+key+" found at the position "+i);
                break;
            }
        }
        if(!found){
            System.out.println("Key not found");
        }
    }
}
