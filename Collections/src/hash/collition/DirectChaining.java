package hash.collition;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainsize=5;

    public DirectChaining(int maxChainsize) {
        this.maxChainsize = maxChainsize;
    }
    public int modAscIIHashFunction(String word, int M){
     char ch[];
     ch=word.toCharArray();
     System.out.println("ch: "+ch[3]);

     int sum=0;
     for (int i=0; i<ch.length; i++){
         sum+=ch[i];
     }
     System.out.println("SUM: "+sum);

     return sum%M;
    }

    public static void main(String[] args) {
        int result;


        DirectChaining directChaining=new DirectChaining(5);
        result=directChaining.modAscIIHashFunction("Hugo", 2);
        System.out.println(result);
    }
}




















