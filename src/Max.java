import java.util.*;
public class Max {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];
        for(int i = 0; i < index; i++){
             arr[i] = sc.nextInt();

        }
        return arr;

    }
    public static void print(int[] arr){
        int index = arr.length;
        for(int i=0; i<index; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int largest(int[] arr){
        int min = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > min) {
                min = arr[i];
            }

        }
        return min;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];

        }
        return sum;
    }
    public static int linearSearch(int[] arr, int num){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                index = i;
            }
            else {
                index = -1;
            }
        }
        return index;
    }
    public static int[] swap(int[] arr){
        for(int i = 0; i<arr.length-1; i=i+2){
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        return arr;

    }
    public static void main(String[] args){
       int input[] = takeInput();
        print(input);
        int elem = largest(input);
        System.out.println("largest : " + elem);
        int sum_ele = sum(input);
        System.out.println("sum is " + sum_ele);
        int search = linearSearch(input,5);
        System.out.println("index is " + search);
        int[] alt_Swap = swap(input);
        print(alt_Swap);


    }
}
