package Arrays;

public class PassingArraysTofunction {
public static void main(String[] args) {
	int[] x= {10,3,7,6,9};
	System.out.println("the array bfire  updating ;"+x[2]);
	change(x);
	System.out.println("the array after updating :" +x[2]);
	
}
public static void change(int[] x) {
	x[2]=9;
}
}
