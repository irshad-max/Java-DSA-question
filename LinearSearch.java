class LinearSearch{
    public static void main(String[] args){
        int arr[]={45,55,655,75,85};
        int target=65;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
             System.out.println("found at index"+" "+i);
             return;
            }
        }
        System.out.println("target is not found");
    }
}