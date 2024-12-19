package Arrays;

public class ArrLargestSmallest {
    public static void LargestSmallest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Largest: " +max);
        System.out.println("Smallest: " +min);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        LargestSmallest(arr);
    }
}
