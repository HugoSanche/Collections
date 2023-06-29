public class MaxProfit {


    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //prices = {7,1 , 5, 3, 6, 4};
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        // TODO
        int n=prices.length;
        int total=0;

        for(int i=0;i<n; i++){
            for(int j=1;j<n; j++){
                if ((prices[j]-prices[i])>total){
                    total=prices[j]-prices[i];
                }
            }
        }
        return total;
    }

    public static int maxProfit3(int array[]){
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int value: array){
            if (value<min){
                min=value;
            }else if (value-min>maxProfit){
                maxProfit=value-min;
            }
        }
        return maxProfit;
    }
}
