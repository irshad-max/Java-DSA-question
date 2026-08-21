class RemoveDuplicate{
    public static void main(String[] args){
        int arr[]={1,2,3,3,4,4,5};
        int start=0;
        int next=1;
        int i=0;
        while(next<arr.length){
            if(arr[start]!=arr[next]){
                start++;
                next++;
            }
            else if(arr[start]==arr[next]){
                arr[start]=-1;
                start++;
                next++;
            }
        }
        while(i<arr.length){
            if(arr[i]!=-1){
            System.out.print(arr[i]);
            }
            i++;
        }
    }
}