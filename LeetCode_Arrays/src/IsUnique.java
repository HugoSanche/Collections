public class IsUnique {
    public static boolean isUnique(int[] intArray) {
        // TODO
        boolean bandera = true;
        // int[] isUnique = {1,2,3,4,5,6};
        int cont = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                System.out.println("i " + i + " j " + j + " " + intArray[i] + " " + intArray[j]);
                if (intArray[i] == intArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}