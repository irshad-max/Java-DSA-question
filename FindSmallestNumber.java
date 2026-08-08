class FindSmallestNumber{
    public static void main(String[] args) {
       int arr[]={3,5,6,-1,8,9,17};
       int find_sml_num=arr[0];
       for(int i=1;i<arr.length;i++){
           if(find_sml_num>arr[i]){
               find_sml_num=arr[i];
           }
       }
       System.out.println(find_sml_num);
  }

}