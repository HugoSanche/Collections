public class SpiralMatrixIV {
    int[][] array;

    int count=0;
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        array=new int[m][n];
        int totalSize=m*n;

        int left=0;
        int right=array[0].length-1;
        int floor=0;
        int ceiling=array.length-1;

        while (count<totalSize){
            //Derecha
            for (int i=left;i<=right; i++){
               head= insert(floor,i,head);
            }
            floor++;
            //Abajo
            if (count<totalSize) {
                for (int x = floor; x <= ceiling; x++) {
                  head=  insert(x, right,head);
                }
                right--;
            }
            if (count<totalSize) {
                //Izquierda
                for (int j = right; j >= left; j--) {
                   head= insert(ceiling, j,head);
                }
                ceiling--;
            }
            //Arriba
            if (count<totalSize) {
                for (int y = ceiling; y >= floor; y--) {
                    head=insert(y, left,head);
                }
                left++;
            }
        }
        return array;
    }
    public ListNode insert(int x,int y, ListNode current){
        if (current!=null) {
            array[x][y] = current.val;
            current = current.next;
        }else{
            array[x][y]=-1;
        }
        count++;
        return current;
    }
}
