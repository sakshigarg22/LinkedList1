import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args){
        int[] arr = {0,7,2,5,4,7,1,3,6};
        Arrays.sort(arr);

        for(int i=0; i < arr.length; i++){
            int count = 0;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    if(count == 1){
                        i++;
                    }
                }


            }

            if(count == 1){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
