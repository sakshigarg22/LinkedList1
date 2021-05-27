public class InsertionSort {
    public static void insertion(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args){
        int input[] = {3,2,6,4,1};
        insertion(input);
        for(int i = 0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
    }
}
