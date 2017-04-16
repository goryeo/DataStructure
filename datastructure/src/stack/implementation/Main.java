package stack.implementation;

public class Main {

	public static void main(String[] args) {
	    /*		
		ArrayStack arrayStack = new ArrayStack(5);
		
	    System.out.println("Array Stack 테스트");
	    
	    for(int i=1; i<=5; i++){
	    	arrayStack.push(i);
	    }
	    System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    
        System.out.println();
	    */
	    
	    ListStack listStack = new ListStack();
	    System.out.println("ListStack 테스트");
	    
	    for(int i=1; i<=6; i++){
	        listStack.push(i);
	    }
	    
	     System.out.println(listStack.pop());
	     System.out.println(listStack.pop());
	     System.out.println(listStack.peek());
	     System.out.println(listStack.peek());    
	     System.out.println(listStack.pop());
	     System.out.println(listStack.pop());
	     System.out.println(listStack.pop());
	     System.out.println(listStack.pop());
	}

}
