public class Permutation {

    public static boolean permutation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int sum1=0;
        int sum2=0;
        int mult1=0;
        int mult2=0;
        for(int i=0; i<array1.length; i++){
            sum1+=array1[i];
            sum2+=array2[i];
            mult1*=array1[i];
            mult2*=array2[i];
        }
    if (sum1==sum2 && mult1==mult2){
        return true;
    }else{
        return false;
    }
    }
    public static boolean permutation2(int[] array1, int[] array2){
  if (array1.length!=array2.length){
      return false;
  }


    boolean bandera=true;
    for(int i=0; i<array1.length; i++){
        bandera=false;
        for(int j=0;j<array2.length; j++){
            if (array1[i]==array2[j]){
                bandera=true;
                break;
            }
        }
        if(!bandera){
            return bandera;
        }
    }
    return bandera;
    }
}
