package stack.implementation;

public class ListStack {
    private Node top;
    
    private class Node{
        private Object data; 
        private Node next;
        
        private Node(Object data){
            this.data = data;
            this.next = null;
        }
    }
    public ListStack(){
        this.top = null;
    }
    public boolean empty(){
        return top == null;
    }
    
    public void push(Object item){
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }
    
    public Object peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        
        return top.data;
    }
    
    public Object pop(){
        Object item = peek();
        top = top.next;
        return item;
    }
}







