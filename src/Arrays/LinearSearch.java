package Arrays;
public class LinearSearch {
public static void main(String[] args) {
	int arr[]= {2,1,4,3,6,8};
	int target=2;
	boolean ispresent=false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			ispresent=true;
	         break;
		}
	}
	if(ispresent==true) {
		
	System.out.println("the target is present in the array");
	}
	else {
		System.out.println("target is missing");
	}
		}
	}
	


