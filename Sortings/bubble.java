import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int k=0; k < a.length; k++){
            System.out.print(a[k]+" ");
        }
}
}
