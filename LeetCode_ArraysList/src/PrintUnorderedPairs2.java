
//time complexity O(AB)
public class PrintUnorderedPairs2 {
    public static void main(String[] args) {
        int [] arrayNumbers={1,2,3,4,5};
        int [] arrayNumbers2={1,2,3,4,5};
        PrintUnorderedPairs2 print=new PrintUnorderedPairs2();
        print.printPairs(arrayNumbers,arrayNumbers2);
    }
    public void printPairs(int[] array1, int[] array2){
        for(int i=0;i<array1.length; i++){
            for(int j=i+1;j<array2.length; j++ ){
                for(int k=i+1;k<array2.length; k++ ) { // ..... O(1) ->CHECK ITS NOT O(N)
                    System.out.print(array1[i] + "" + array2[j]);// ..... O(1)
                }
            }
            System.out.println();
        }
    }
}
