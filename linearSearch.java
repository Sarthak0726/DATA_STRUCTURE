
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int arr[]= {8,7,4,32};
		
		int n=7,k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				System.out.println("found");
				k=1;
				break;
			}
		}
		
		if(k==0)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Found");
		}
	}

}