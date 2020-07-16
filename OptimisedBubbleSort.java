public class OptimisedBubbleSort {

	public static void main(String[] args) {
		
		int a[] = {23,1,78,2,5,8};
		
       int n = a.length;
		
		boolean swap;
		for(int i=0;i<n-1;i++)
		{   
			swap=false;
			for(int j=0 ;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap=true;
				}
			}
			
			if(swap==false)
			{
				break;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
