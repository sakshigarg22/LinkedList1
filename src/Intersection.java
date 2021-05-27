import java.util.Scanner;
public class Intersection {
    public static void intersection(int arr1[], int arr2[]){
//        int i = 0;
//        int j = 0;
//        while (i < arr1.length && j < arr2.length) {
//            if(arr1[i] < arr2[j]){
//                i++;
//            }
//            else if(arr2[j] < arr1[i]){
//                j++;
//            }
//            else{
//                System.out.print(arr2[j++] + " ");
//                i++;
//            }


        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr2[j] + " ");

                   arr2[j] = 23423;

                }


            }

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        for(int i = 0; i<size1; i++) {
            arr1[i] = sc.nextInt();

        }
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for(int i = 0; i<size2; i++) {
            arr2[i] = sc.nextInt();

        }
        intersection(arr1, arr2);
    }
}
