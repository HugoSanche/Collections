
//time complexity O(N^2)
public class PrintPairs {
    public static void main(String[] args) {
        int [] arrayNumbers={1,2,3,4,5};
        PrintPairs print=new PrintPairs();
        print.printPairs(arrayNumbers);
    }
    public void printPairs(int[] array){
        for(int i=0;i<array.length; i++){ //..... O(N)
            for(int j=0;j<array.length; j++ ){ //..... O(N)
                System.out.print(array[i]+""+array[j]);// ..... O(i)
            }
            System.out.println();
        }
    }
}
