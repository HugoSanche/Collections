
//time complexity O(ab)

public class CompareTwoArrays {
    public static void main(String[] args) {
        int [] arrayOne={1,2,3,4,5};
        int [] arrayTwo={5,7,3,4,5};
        CompareTwoArrays print=new CompareTwoArrays();
        print.printPairs(arrayOne,arrayTwo);
    }

    // check loop between two different arrays

    //check in this case time complexity is not O(n2)
    public void printPairs(int[] arrayOne, int[] arrayTwo){
        for(int i=0;i<arrayOne.length; i++){
            for(int j=0;j<arrayTwo.length; j++ ){
                if(arrayOne[i]<arrayTwo[j])
                    System.out.print(arrayOne[i]+""+arrayTwo[j]);///O(1)
            }
            System.out.println();
        }
    }
}
