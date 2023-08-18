public class Stack {
    int arr[];
    int topOfStack;


    //time complexity O(1)
    //space complexity O(N)
    public Stack(int size) {
        this.arr = new int[size]; //created new stack
        this.topOfStack = -1; //if = -1 is empty
        System.out.println("The Stack was created with size " + size);
    }

    //time complexity O(1)
    //space complexity O(1)
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }
    //time complexity O(1)
    //space complexity O(1)
    public boolean isFull(){
        if(topOfStack==arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    //time complexity O(1)
    //space complexity O(1)

    //this method insert new value in the stack
    public void push(int value){
     if(isFull()){
      //   System.out.println(value);
         System.out.println("The Stack is full");
     } else{
         topOfStack++;
         arr[topOfStack]=value;
         System.out.println("The value is successfully inserted");
     }
    }
    //time complexity O(1)
    //space complexity O(1)

    //this method deleted the last value of stack
    public  int pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }else{
            int valueStack=arr[topOfStack];
            topOfStack--;
            return valueStack;
        }
    }
    //time complexity O(1)
    //space complexity O(1)
    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }
    public void delete(){
        arr=null;
        System.out.println("The Stack is successfully deleted");
    }
}


