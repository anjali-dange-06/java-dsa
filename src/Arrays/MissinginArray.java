package Arrays;
public class MissinginArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int n = arr.length + 1;
        int sum = 0;
        int totalSum = n * (n + 1) / 2;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The missing element is : " + (totalSum - sum));
    }
}