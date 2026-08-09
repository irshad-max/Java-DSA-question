class FindSecondLargestNumber{
    public static void main(String[] args) {
       int arr[]={12,20,18};
       int find_lag_num=arr[0];
       int find_scdlag_num=Integer.MIN_VALUE;
       for(int i=1;i<arr.length;i++){
           if(find_lag_num<arr[i]){
               find_scdlag_num=find_lag_num;
               find_lag_num=arr[i];
           }
           else if(arr[i]>find_scdlag_num && arr[i]!=find_lag_num){
               find_scdlag_num=arr[i];
           }
       }
       System.out.println(find_scdlag_num);
  }

}