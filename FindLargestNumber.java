class FindLargestNumber{
    public static void main(String[] args) {
       int arr[]={1,3,5,6,8,9,17};
       int find_lag_num=arr[0];
       for(int i=1;i<arr.length;i++){
           if(find_lag_num<arr[i]){
               find_lag_num=arr[i];
           }
       }
       System.out.println(find_lag_num);
  }

}