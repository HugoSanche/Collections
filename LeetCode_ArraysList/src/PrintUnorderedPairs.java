
//time complexity O(N2)
public class PrintUnorderedPairs {
    public static void main(String[] args) {
        int [] arrayNumbers={1,2,3,4,5};
        PrintUnorderedPairs print=new PrintUnorderedPairs();
        print.printPairs(arrayNumbers);
    }
    public void printPairs(int[] array){
        for(int i=0;i<array.length; i++){ //..... O(N)
            for(int j=i+1;j<array.length; j++ ){ //..... O(N)
                System.out.print(array[i]+""+array[j]);// ..... O(i)
            }
            System.out.println();
        }
    }
}
