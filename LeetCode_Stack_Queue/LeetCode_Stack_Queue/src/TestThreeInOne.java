public class TestThreeInOne {
    public static void main(String[] args) {
        ThreeInOne threeInOne=new ThreeInOne(3);

        threeInOne.push(0,10);
        threeInOne.push(0,20);
        threeInOne.push(0,30);
        threeInOne.push(0,40);
        threeInOne.push(1,10);
        threeInOne.push(1,20);

        boolean result=threeInOne.isEmpty(0);
        System.out.println(result);

        int delete= threeInOne.pop(1);
        System.out.println(delete);

        //peek
        System.out.println("peek "+threeInOne.peek(1));
    }
}
