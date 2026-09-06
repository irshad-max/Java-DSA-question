import java.util.*;
public class SubarrayMax {
    public static void main(String[] args) {
int arr[] = {5, -2, 3, 4, -1, 2, -6, 4};
int n=arr.length;
int currentsum=0;
int maxsum=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    currentsum+=arr[i];
    if(currentsum<0){
       currentsum=0; 
    }
        if(currentsum>maxsum){
        maxsum=currentsum;
        }
}
System.out.print(maxsum);
    }
}