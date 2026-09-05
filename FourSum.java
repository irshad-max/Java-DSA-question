import java.util.*;

public class FourSum {
    public static void main(String[] args) {
      int arr[]={1,1,3,4,5};
      int left=0;
      int right=0;
      int n=arr.length;
      int target=10;
      int totalsum=0;
      for(int i=0;i<n;i++){
          for(int j=1;j<n;j++){
                left=j+1;
                right=arr.length-1;
                while(left<right){
                   totalsum=arr[i]+arr[j]+arr[left]+arr[right];
                   if(totalsum==target){
                    System.out.println("index :"+i+" "+j+" "+left+" "+right);  
                    return;
                   }
                   else if (totalsum<target){
                       left++;
                   }
                 else{
                    right--;
                 }  
                }
            }
      }
    }
}