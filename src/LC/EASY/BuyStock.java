package LC.EASY;

public class BuyStock {

    public static void main(String[] args) {
        int[] arr = {7,2,5,3,6,4, 1, 2,3,8};
        int maxPrfit = findMaxProfitAnywhere(arr);
        System.out.println("Max Profit " + maxPrfit);
    }

    private static int findMaxProfit(int[] arr) {
        int buy = arr[0], sell = arr[0];
        for(int i = 1; i< arr.length; i++) {
            if(buy > arr[i]) {
                buy = sell = arr[i];
            } else if(sell < arr[i]){
                sell = arr[i];
            }

        }
        return sell - buy;
    }
    //anywehre in the sequence
    private static int findMaxProfitAnywhere(int[] arr) {
        int buy = arr[0], sell = arr[0];
        int maxProfit=0, currentProfit=0;
        for(int i = 1; i< arr.length; i++) {
            if(buy > arr[i]) {
                currentProfit = sell - buy;
                maxProfit = Integer.max(maxProfit, currentProfit);
                buy = sell = arr[i];
            } else if(sell < arr[i]){
                sell = arr[i];
            }

        }

        return Integer.max(maxProfit, sell - buy);
    }
}
