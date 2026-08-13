class IsCheckSorted{
    public static void main(String[] args){
       int arr[]={1,2,3,4,5};
       int n=arr.length-1;
       Boolean check=true;
       for(int i=0;i<n;i++){
           if(arr[i]>arr[i+1]){
               System.out.println("Array is not sorted");
              check=false;
               break;
           }
       }
       if(check){
       System.out.println("Array is sorted");
       }
    }
}