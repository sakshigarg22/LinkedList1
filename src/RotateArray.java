import java.util.*;
public class RotateArray {
    public static void rotate(int[] arr, int n, int element){

        for(int i = element; i < n; i++) {

            System.out.print(arr[i] + " ");
            if(i == arr.length-1){
                for(int j = 0; j<element; j++){
                    System.out.print(arr[j] + " ");
                }
            }

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int elem = sc.nextInt();

          rotate(a, n, elem);


    }
}
