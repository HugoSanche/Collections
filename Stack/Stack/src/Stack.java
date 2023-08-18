public class Stack {
    int arr[];
    int topOfStack;


    //time complexity O(1)
    //space complexity O(N)
    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
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
    public boolean isFull(){
        if(topOfStack==arr.length-1){
            System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }

}