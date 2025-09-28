import java.util.Scanner;

public class three3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int evn = 0, odd = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                evn++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even elements are "+evn+" and number of odd elements in the array are "+odd);
}
}
