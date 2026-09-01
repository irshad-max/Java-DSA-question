import java.util.*;

class FindLeader{
    public static void main(String[]args){
        ArrayList<Integer>leader=new ArrayList<>();
        int arr[]={10,22,12,3,0,6};
        int newLeader=arr[arr.length-1];
        leader.add(newLeader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>newLeader){
                newLeader=arr[i];
                leader.add(newLeader);
            }
        }
        System.out.println(leader);
    }
}