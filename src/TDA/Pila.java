package TDA;

public class Pila {
    char []S;
    int last;
    int MaxSize;
    
    public Pila(int p_size){
        MaxSize = p_size;
        last = -1;
        S = new char [MaxSize];
    }
    
    public boolean isFull(){
        boolean full = false;
        if(last == MaxSize-1)
            full = true;
        return full;
    }
    
    public boolean isEmpty(){
        boolean empty = false;
        if(last == -1)
            empty = true;
        return empty;
    }
    
    public void push(char value){
        if (!isFull()) {
            last++;
            S[last] = value;
        }
    }
    
    public char pop(){
        char element = 0;
        if (!isEmpty()) {
            element = S[last];
            last--;            
        }
        return element;
    }     
    
    public void printStack(){
        for(int i = last -1 ;i >= 0;i--)
        {
            System.out.print(S[i]);
            
        }
    }
}
