public class SingleDimensionArray {
    int arr[]=null;
    public SingleDimensionArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i]=Integer.MIN_VALUE;
            System.out.println(arr[i]);
        }
    }
    public void insert(int location, int valueToBeInserted){
        try{
            if (arr[location]==Integer.MIN_VALUE){
                arr[location]=valueToBeInserted;
                System.out.println("Value was inserted");
            }
            else{
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array"+ e);
        }
    }
    public void traverseArray(){
        try{
            for (int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }catch(Exception e){
            System.out.println("Array no longer exist");
        }

    }
    //Search of element in array
    public void searchInArray(int valueToSearch){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==valueToSearch){
                System.out.println("Value found in the index "+i);
                return;
            }
        }
        System.out.println(valueToSearch+" Does not found in the array");
    }
    public void deleteValue(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex]=Integer.MIN_VALUE;
            System.out.println("The value was deleted");
        }catch (Exception e){
            System.out.println("Does not found the index of value to deleted");
        }

    }
}



















