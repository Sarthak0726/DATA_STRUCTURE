import java.util.Stack;

public class InfixToPrefix {

	
	static boolean isOperator(char j) 
	{ 
	    return (!(j >= 'a' && j<= 'z') &&  
	            !(j >= '0' && j <= '9') &&  
	            !(j >= 'A' && j <= 'Z')); 
	} 

	static int getPriority(char k) 
	{ 
	    if (k == '-' || k== '+') 
	        return 1; 
	    else if (k == '*' || k == '/') 
	        return 2; 
	    else if (k == '^') 
	        return 3; 
	    return 0; 
	} 

	static String infixToPrefix(String infix) 
	{ 
	  
	    Stack<Character> operators = new Stack<Character>(); 
	 
	    Stack<String> operands = new Stack<String>(); 
	  
	    for (int i = 0; i < infix.length(); i++)  
	    { 
	        if (infix.charAt(i) == '(')  
	        { 
	            operators.push(infix.charAt(i)); 
	        } 
	   
	        else if (infix.charAt(i) == ')')  
	        { 
	            while (!operators.empty() &&  
	                operators.peek() != '(')  
	                { 
	  
	                String op1 = operands.peek(); 
	                operands.pop(); 

	                String op2 = operands.peek(); 
	                operands.pop(); 

	                char op = operators.peek(); 
	                operators.pop(); 
	
	                String tmp = op + op2 + op1; 
	                operands.push(tmp); 
	            } 

	            operators.pop(); 
	        } 

	        else if (!isOperator(infix.charAt(i)))  
	        { 
	            operands.push(infix.charAt(i) + ""); 
	        } 
 
	        else 
	        { 
	            while (!operators.empty() &&  
	                getPriority(infix.charAt(i)) <=  
	                    getPriority(operators.peek()))  
	                { 
	  
	                String op1 = operands.peek(); 
	                operands.pop(); 
	  
	                String op2 = operands.peek(); 
	                operands.pop(); 
	  
	                char op = operators.peek(); 
	                operators.pop(); 
	  
	                String tmp = op + op2 + op1; 
	                operands.push(tmp); 
	            } 
	  
	            operators.push(infix.charAt(i)); 
	        } 
	    } 

	    while (!operators.empty())  
	    { 
	        String op1 = operands.peek(); 
	        operands.pop(); 
	  
	        String op2 = operands.peek(); 
	        operands.pop(); 
	  
	        char op = operators.peek(); 
	        operators.pop(); 
	  
	        String tmp = op + op2 + op1; 
	        operands.push(tmp); 
	    } 

	    return operands.peek(); 
	} 
	  

	
	public static void main(String[] args) {
		   
		String s = "(A-B/C)*(A/K-L)"; 
	    System.out.println( infixToPrefix(s)); 
	}

}