package Arrays;

public class LinearSearch {
    public static int linearSearch(int arr[], int target) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,2,7};
        int target = 55;
        System.out.println(linearSearch(arr, target));
    }
}
