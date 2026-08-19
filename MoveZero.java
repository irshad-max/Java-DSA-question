class MoveZero{
    public static void main(String[] args){
        int arr[]={7,0,0,0,0,1,2,0};
        int start=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[start]!=0){
             start++;
            }
            else if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                start++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}