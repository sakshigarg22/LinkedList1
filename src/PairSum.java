import java.util.*;
public class PairSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr= new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int count = 0;

        for(int i = 0; i<N-1; i++){
            for(int j = i+1; j<N; j++){
                if(arr[i] + arr[j] == X){

                   count++;
                }
            }

        }
        System.out.println(count);
    }
}
