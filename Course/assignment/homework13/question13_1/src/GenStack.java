public class GenStack<T> {
    private Object[] stack;
    private int top;

    public GenStack(int size){
        stack = new Object[size];
        top = 0;
    }

    public void push(T item){
        stack[top++] = item;
    }

    public T pop(){
        return (T) stack[--top];
    }

    public boolean isEmpty(){
        return (top == 0);
    }

    public boolean isFull(){
        return (top == stack.length);
    }
}
