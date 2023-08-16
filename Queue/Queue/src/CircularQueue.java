public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    //Time Complexity O(1)
    //Space complexity O(N)
    public CircularQueue( int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("The circular queue is successfully created by size "+size);
    }
    public boolean isEmpty(){
        if (topOfQueue==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (topOfQueue+1==beginningOfQueue){
            return true;
        }else if (beginningOfQueue==0 && topOfQueue+1==size){
            return true;
        }else{
            return false;
        }
    }

    //Time Complexity O(1)
    //Space complexity O(1)
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The circular Queue is full");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted Circular queue with value "+value);
        }else{
            if (topOfQueue+1==size){
                topOfQueue=0;
            }else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted Circular queue with value "+value);
        }
    }
    //Time Complexity O(1)
    //Space complexity O(1)
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The ciruclar is empty");
            return -1;
        }else{
            int result=arr[beginningOfQueue];
            arr[beginningOfQueue]=0;
            if (beginningOfQueue==topOfQueue){
                beginningOfQueue=topOfQueue=-1;
            }else if (beginningOfQueue+1==size){
                beginningOfQueue=0;
            }else{
                beginningOfQueue++;
            }
            return result;
        }
    }
    //peek
    //Time Complexity O(1)
    //Space complexity O(1)
    public int peek(){
        if(isEmpty()){
            System.out.println("The circular queue is empty");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
    }
    //Time Complexity O(1)
    //Space complexity O(1)
    public void deleted(){
        arr=null;
        System.out.println("The circular queue is successfully deleted");
    }
}



