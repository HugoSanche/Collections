public class TestSingleDimensionArray {
    public static void main(String[] args) {
        SingleDimensionArray array=new SingleDimensionArray(10);

        array.insert(0,0);
        array.insert(1,10);
        array.insert(2,20);
        array.insert(1,30);
        array.insert(12,120);
        System.out.println("Array traversal");
        array.traverseArray();
        array.searchInArray(40);
        array.deleteValue(3);

    }

}
