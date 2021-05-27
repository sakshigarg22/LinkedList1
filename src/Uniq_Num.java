import java.util.Arrays;

public class Uniq_Num {


    public static void main(String[] args){
//        boolean[] brr = new boolean[5];
//        System.out.println(brr[0]);
        int[] arr = {2,4,7,2,7};
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

            if(count != 1){
                System.out.println(arr[i]);
            }
        }


    }

}
