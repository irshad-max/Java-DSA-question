class FindEquilibrium{
     public static void main(String[]args){
         int arr[]={2,3,-1,8,4};
         int total=0;
         for(int x:arr){
            total+=x; 
         }
         int rightsum=0;
         int leftsum=0;
         for(int i=0;i<arr.length;i++){
            rightsum=total-leftsum-arr[i];
            if(rightsum==leftsum){
                System.out.println("equilibrium index :"+i);
                }
                else{
                    leftsum+=arr[i];
                }
         }
     }
}