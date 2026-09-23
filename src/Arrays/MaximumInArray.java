package Arrays;
public class MaximumInArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,23,8};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("the maximum in an array is : "+max);
}
}
