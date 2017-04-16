package stack.implementation;

public class ArrayStack {
    private int top;
    private int maxSize;
    private Object[] arrayStack;
    
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        this.arrayStack = new Object[maxSize];
        this.top = -1;
    }
    
    public boolean empty(){
        return top == -1;
    }
    
    public boolean full(){
        return top == maxSize-1;
    }
    
    public void push(Object item){
        if(full()) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);

        arrayStack[++top] = item;
    }
    
    public Object peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException(top);
        
        return arrayStack[top];
    }
    
    public Object pop(){
        Object item = peek();
        top--;
        return item;
    }
    
}













