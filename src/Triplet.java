import java.util.Scanner;
public class Triplet{
    public static void triplet(int[] arr, int element){
        int count = 0;
        for(int i = 0; i < arr.length-2; i++){
            for(int j = i+1; j < arr.length-1; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i] + arr[j]+ arr[k] == element){
                        //System.out.println(arr[i] + " " +  arr[j]  + " "  + arr[k] + " equals" + element);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int element  = sc.nextInt();
        triplet(arr, element );
    }
}
