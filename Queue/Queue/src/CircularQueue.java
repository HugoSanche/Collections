public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

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
}



