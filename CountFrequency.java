import java.util.*;
class CountFrequency{
    public static void main(String[] args){
    HashMap<Integer,Integer>count=new HashMap<>();
    int arr[]={2,2,2,1,1,3,3};
    for(int val:arr){
        if(count.containsKey(val)){
            count.put(val,count.get(val)+1);
        }
        else{
            count.put(val,1);
        }
    }
    System.out.println(count);
    } 
}