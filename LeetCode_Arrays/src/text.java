public class text {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};;
       // array={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        int left=array.length;
        int right=array[0].length;

        System.out.println(left);
        System.out.println(right);

        for(int i=0;i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
