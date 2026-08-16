class RotateArrayByk{
    static void reverse(int arr[],int left,int right){
        int start=left;
        int end=right;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
       int arr[]={1,2,3,4,5,6};
       int n=arr.length-1;
       int k=2;
       reverse(arr,0,n);
       reverse(arr,0,k-1);
       reverse(arr,k,n);
       for(int i=0;i<=n;i++){
           System.out.print(arr[i]+" ");
       }
    }
}