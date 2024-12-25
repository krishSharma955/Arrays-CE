package Arrays;

public class OptBinarySearch { //first occurence of an element
    public static int bSearch(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                index = mid;
                end = mid-1;
            }
            else if(arr[mid]>target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,4};
        int target = 3;
        System.out.println(bSearch(arr,target));
    }
}
