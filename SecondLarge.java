import java.util.Arrays;
class SecondLarge{
	public static int getSecondLarge(int[]a,int totel){
		Arrays.sort(a);
		return a[totel-2];
	}
	public static void main(String[]args){
		int a[]={1,2,5,6,7,8};
		int b[]={22,33,44,55,77,88,11};
		System.out.println("Secondlargest:"+getSecondLarge(a,6));
		System.out.println("Secondlargest:"+getSecondLarge(b,7));
	}
}

		
		