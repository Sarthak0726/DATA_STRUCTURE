public class MaxElement {

	public static void main(String[] args) {
		
		int a[] = {30,2,4,100,5,1};
		
    int max =Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);

	}

}