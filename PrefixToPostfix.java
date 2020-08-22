import java.util.Stack;

public class PrefixToPostfix {
	
	
	

	static boolean isOperator(char x)  
	{ 
	    switch (x)  
	    { 
	        case '+': 
	        case '-': 
	        case '/': 
	        case '*': 
	        return true; 
	    } 
	    return false; 
	} 

	static String preToPost(String a) 
	{ 
	  
	    Stack<String> s= new Stack<String>(); 
	  
	   
	    int length = a.length(); 
	  

	    for (int i = length - 1; i >= 0; i--)  
	    { 
	  
	        if (isOperator(a.charAt(i)))  
	        { 
	  
	            String op1 = s.peek(); s.pop(); 
	            String op2 = s.peek(); s.pop(); 
	  
	            
	            String temp = op1 + op2 + a.charAt(i); 
	  
	            s.push(temp); 
	        } 
	  
	        else
	        { 
	            s.push( a.charAt(i)+""); 
	        } 
	    } 

	    return s.peek(); 
	} 

	public static void main(String args[])  
	{ 
	    String pre_exp = "*-A/BC-/AKL"; 
	    System.out.println("Postfix : " + preToPost(pre_exp)); 
	} 
	

}