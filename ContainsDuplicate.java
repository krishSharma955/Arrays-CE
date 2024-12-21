package Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
