package Arrays;

public class MaxSubarray {
    public static int maxsubSum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i<arr.length; i++) {
            currsum += arr[i];
            maxsum = Math.max(currsum, maxsum);
            if(currsum<0) {
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubSum(arr));
    }
}
