import java.util.*;
public class MajorityElement_2{
    public static void main(String[] args) {
      HashMap<Integer,Integer>list =new HashMap<>();
      int arr[]={2,2,1,3,2,2,2};
      int n=arr.length;
      for(int i=0;i<n;i++){
          if(list.containsKey(arr[i])){
             list.put(arr[i],list.getOrDefault(arr[i],0)+1);
              
          }
          else{
              list.put(arr[i],1);
          }
      }
      for(int key:list.keySet()){
          if(list.get(key)>n/3){
           System.out.print(key);
          }
      }
    }
}