public class BubbleSort {
    public static int[] bubble_Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }


            }

        }
        return arr;

    }



    public static void main(String[] args){
        int input[] = {2,5,3,4,1};
        int[] sort = bubble_Sort(input);
        for(int i=0; i<sort.length;i++) {
            System.out.print(sort[i] +  " ");

        }
    }
}
