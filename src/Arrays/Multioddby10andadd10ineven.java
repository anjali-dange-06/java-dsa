package Arrays;

public class Multioddby10andadd10ineven {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	for(int i=0;i<arr.length;i++)
		if(i%2!=0) {
			arr[i]=arr[i]+2;
		}
		else {
			arr[i]=arr[i]+10;
		}
	System.out.println("the new array is : ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"  ");
	}
}
}
