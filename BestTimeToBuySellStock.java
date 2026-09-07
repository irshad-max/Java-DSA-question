import java.util.*;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
     int arr[]={7,5,10,3,6};
     int n=arr.length;
     int min=arr[0];
     int max=0;
     int profit=0;
     int sellAt=0;
     int buyAt=0;
     for(int i=1;i<n;i++){
         if(min>arr[i]){
             min=arr[i];
         }
        else if (arr[i]>min){
            profit=arr[i]-min;
            if(profit>max){
                buyAt=min;
              max=profit;
              sellAt=arr[i];
            }
        }
     }
     System.out.println("buy at :"+buyAt);
     System.out.println("sell at :"+sellAt);
     System.out.println("profit :"+max);
    }
}