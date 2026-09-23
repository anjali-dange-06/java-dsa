package Arrays;

public class ŚhallowCopyḌeepCopy {
public static void main(String[] ar̥gs) {
	int[] arr= {10,20,30,40};
	int[] x=arr;//shallow copy
	x[0]=100;
	System.out.println(arr[0]);
	System.out.println(x[0] );
System.out.println("the first array is");
for(int i=0;i<arr.length;i++) {
System.out.print(arr[i]+"  ");	
	
}
	for(int j=0;j<x.length;j++)
	{
	System.out.print(x[j]+"  ");	
	}
	}

}
