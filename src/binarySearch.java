public class binarySearch {
    public  static int BinarySearch(int[] input, int elem){
        int start = 0;
        int end = input.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(elem == input[mid]){
                 return mid;
            }
            else if(elem > input[mid]){
                start = mid + 1;
            }
            else if(elem < input[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] input = {2,4,5,7,26,34};
        int index = BinarySearch(input, 5);
        System.out.println(index);

    }
}
