package Arrays;

public class RemoveElement {
    public static int removeElement(int arr[], int val) {
        int num = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]!=val) {
                arr[num] = arr[i];
                num++;
            }
        }
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        return num;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(arr, val));
    }
}
