package Arrays;

public class PeakElement {
    public static int peakElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        System.out.println(peakElement(arr));
    }
}
