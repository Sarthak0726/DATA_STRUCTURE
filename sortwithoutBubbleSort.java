import java.util.Arrays;

public class SortWithoutBubbleSort {
   
	
	public static void main(String[] args) {
		
		int a[] = {100,4,6,7};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}