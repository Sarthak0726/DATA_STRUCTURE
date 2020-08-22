import java.util.Stack;

public class EvaluationPostfix {
	
	
	
	public static int evaluatePostFix(String a)
	{
		
		 Stack<Integer> stack=new Stack<>(); 
         
	        
	        for(int i=0;i<a.length();i++) 
	        { 
	            char c=a.charAt(i); 
	   
	            if(Character.isDigit(c)) 
	            stack.push(c - '0'); 
	             
	            else
	            { 
	                int val1 = stack.pop(); 
	                int val2 = stack.pop(); 
	                  
	                switch(c) 
	                { 
	                    case '+': 
	                    stack.push(val2+val1); 
	                    break; 
	                      
	                    case '-': 
	                    stack.push(val2- val1); 
	                    break; 
	                      
	                    case '/': 
	                    stack.push(val2/val1); 
	                    break; 
	                      
	                    case '*': 
	                    stack.push(val2*val1); 
	                    break; 
	              } 
	            } 
	        } 
	        return stack.pop();
	}

	public static void main(String[] args) {
		
		String a="932*+9-"; 
        System.out.println("postfix evaluation: "+evaluatePostFix(a));
   
	}

}