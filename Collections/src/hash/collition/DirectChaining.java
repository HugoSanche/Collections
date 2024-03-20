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

    public void insertHashTable(String word){
        int newIndex=modAscIIHashFunction(word, hashTable.length);
        if(hashTable[newIndex]==null){
            hashTable[newIndex]=new LinkedList<String>();
            hashTable[newIndex].add(word);
        }else{
            hashTable[newIndex].add(word);
        }
    }
public void printHashTable(){
        if (hashTable==null){
            System.out.println("Hashtable does not exits");
            return;
        }else{
            System.out.println("-------HashTable-----------------");
            for (int i=0;i<hashTable.length; i++){
                System.out.println("Hashtable index: "+i+", key: "+hashTable[i]);
            }
        }
}
    public static void main(String[] args) {
        int result;


        DirectChaining directChaining=new DirectChaining(13);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("quick");
        directChaining.insertHashTable("brown");
        directChaining.insertHashTable("fox");
        directChaining.insertHashTable("over");
        directChaining.printHashTable();
    }
}




















