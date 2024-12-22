package Arrays;
// import java.util.*;

public class SecondLargest {
    // public static int secondLargest(int arr[]) { //using sorting
    //     Arrays.sort(arr);
    //     for(int i = arr.length-2; i>=0; i--) {
    //         if(arr[i]!=arr[arr.length-1]) {
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
    public static int secondLargest(int arr[]) {
        int largest = -1, secondlargest = -1;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]>largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondlargest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(secondLargest(arr));
    }
}
