package greedy;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MinimumNumberOfCoins {
    /**
     * Input: coins[] = {25, 10, 5}, sum = 30
     * Output: 2
     * Explanation : Minimum 2 coins needed, 25 and 5
     * <p>
     * Input: coins[] = {9, 6, 5, 1}, sum = 19
     * Output: 3
     * Explanation: 19 = 9 + 9 + 1
     * <p>
     * Input: coins[] = {5, 1}, sum = 0
     * Output: 0
     * Explanation: For 0 sum, we do not need a coin
     * <p>
     * Input: coins[] = {4, 6, 2], sum = 5
     * Output: -1
     * Explanation: Not possible to make the given sum.
     */
    public static int minCoins(int coins[], int sum) {

        var sortedCoinPurse = Arrays.stream(coins)
                .mapToObj(Integer::valueOf)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        int totalNumberOfCoins = 0;
        int target = sum;
        System.out.println( "coin Denominations are:");
       for(Integer coinDenomination:sortedCoinPurse) {
           totalNumberOfCoins += target / coinDenomination;
           if ( target / coinDenomination !=0){
               System.out.print(coinDenomination +"->" + target / coinDenomination + " , ");
           }
           target = target % coinDenomination;
       }

        return totalNumberOfCoins;
    }

    public static void main(String[] args) {

        int coins[] = {1,2,5,10,20,50,100,500, 1000};
        System.out.println( "minimum total number of cons for " + minCoins(coins, 49));
        System.out.println( "minimum total number of cons for " + minCoins(coins, 87));

    }

}
