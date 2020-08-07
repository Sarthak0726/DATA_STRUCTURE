import java.util.Stack;

public class PallindromeStacks {

	public static boolean isPallin(String a)
	{
		Stack<Character> stack = new Stack<>();
		
		int l = a.length();
		
		int i=0;
		int mid=l/2;
		
		for(i=0;i<mid;i++)
		{
			stack.push(a.charAt(i));
		}
		
		if(l%2!=0)
		{
			i++;
		}
		
		while(i<l)
		{
			char k = stack.pop();
			
			if(k!=a.charAt(i))
			{
				return false;
			}
			i++;
		}
		
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		String a="abal";
		
		if(isPallin(a))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}
}