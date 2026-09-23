package Arrays;
public class SumOfAllElements {
public static void main(String[] args) {
	int[] arr= {-6,2,3,4,1,54};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("The sum of all Elements present in an array is :"+ sum);
}
}
