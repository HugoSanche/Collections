public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    public  QueueArray(int size){
        this.arr=new int[size];
        topOfQueue=-1;
        beginningOfQueue=-1;
        System.out.println("The Queue is succesfully created with size "+size);
    }
    public boolean isFull(){
        if (topOfQueue== arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if ((beginningOfQueue==-1) || (beginningOfQueue==arr.length)){
            return true;
        }else{
            return false;
        }
    }
    //Time Complexity O(1)
    //Space Complexity O(1)
    //Queue
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue ins full");
        }else if (isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted "+value+" int the queue");
        }else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted "+value+" int the queue");
        }
    }
    //Time Complexity O(1)
    //Space Complexity O(1)
    //deQueue
    public int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            int result=arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue>topOfQueue){
                beginningOfQueue=topOfQueue=-1;
            }
            return result;
        }
    }
    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }
        else{
            System.out.println("Queue is empty");
        }
        return -1;
    }
    //delete
    public void deleteQueue(){
        arr=null;
        System.out.println("Queue has been deleted");
    }


//    public int delete(){
//        if (!isEmpty()){
//           for (int i=beginningOfQueue; i<=topOfQueue;i++){
//               arr[i]=0;
//           }
//            beginningOfQueue=topOfQueue=-1;
//        }
//        else{
//            System.out.println("Queue is empty");
//        }
//        return -1;
//    }

}

