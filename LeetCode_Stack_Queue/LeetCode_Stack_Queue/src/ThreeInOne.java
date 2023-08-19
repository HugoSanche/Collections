public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        // TODO
        stackCapacity=stackSize;
        values=new int[numberOfStacks*stackSize];
        sizes=new int[numberOfStacks];  //En este arreglo lleva el contador de cuantos elementos tiene agregados cada stack
    }

    // isFull
    public boolean isFull(int stackNum) {
        // TODO
        if(sizes[stackNum]==stackCapacity){
            return true;
        }else{
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        // TODO
        if(sizes[stackNum]==0){
            return true;
        }else{
            return false;
        }
    }
    // indexOfTop - this is helper method for push, pop and peek methods
    private int indexOfTop(int stackNum) {
        // TODO
        int offset=stackNum*stackCapacity;
        int size=sizes[stackNum];
        return offset+size-1;

    }

    // push
    public void push(int stackNum, int value) {
       if(isFull(stackNum)){
           System.out.println("The stack number "+stackNum+" is full");
        }else{
           sizes[stackNum]++;
           int top= indexOfTop(stackNum);
           values[top]=value;
       }
    }

    // pop
    public int pop(int stackNum) {
        // TODO
        if(isEmpty(stackNum)){
            System.out.println("The stack is empty");
            return -1;
        }else{
            int value=values[indexOfTop(stackNum)];
            values[indexOfTop(stackNum)]=0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek
    public int peek(int stackNum) {
        if(isEmpty(stackNum)){
            System.out.println("The stack is empty");
            return -1;
        }else{
            return values[indexOfTop(stackNum)];
        }
    }

}

