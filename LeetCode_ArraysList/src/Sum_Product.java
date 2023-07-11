
//Calculate the sum and the product of the array
public class Sum_Product {
    public static void main(String[] args) {
        int [] arrayNumbers={1,2,3,4,5};
        Sum_Product calculate=new Sum_Product();
        calculate.calculate(arrayNumbers);
    }
    public void calculate(int[] array){
        int sum=0;
        int product=1;
        for (int i=0; i<array.length; i++){
            sum+=array[i];
            product*=array[i];
        }
        System.out.println("Value of sum "+sum);
        System.out.println("Value of product "+product);
    }
}
