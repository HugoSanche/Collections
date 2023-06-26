public class FindTopTwoScores {

        public static int[] findTopTwoScores(int[] array){
            int[] firstSecond= new int[2];
            firstSecond[0]=array[0];
            for (int i=0; i<array.length-1; i++){
                if (firstSecond[0]<array[i+1]){
                    firstSecond[1]=firstSecond[0];
                    firstSecond[0]=array[i+1];
                }else{
                    if (firstSecond[0]>array[i+1] && firstSecond[1]<array[i+1]){
                        firstSecond[1]=array[i+1];
                    }
                }
            }
            return firstSecond;
        }
}
