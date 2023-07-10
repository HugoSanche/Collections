import java.util.Arrays;

public class RotateMatriz {
    public static void rotateMatrix(int[][] matrix) {
        //
        int n=matrix.length;

        for (int layer=0; layer<n/2; layer++){
            int first=layer;
            int last=n-1-layer;
            for (int i=first; i<last; i++){
                int offset=i-first;

                //save top value
                int top=matrix[first][i];

                //left->top
                matrix[first][i]=matrix[last-offset][first];

                //bottom ->left
                matrix[last-offset][first]=matrix[last][last-offset];

                //right->bottom
                matrix[last][last-offset]=matrix[i][last];

                //top->rigth
                matrix[i][last]=top;

            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}














