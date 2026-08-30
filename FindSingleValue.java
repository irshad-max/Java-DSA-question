class FindSingleValue{
    public static void main(String[] args){
        int arr[]={7,3,5,3,7,5,9};
        int result=0;
        for(int x:arr){
            result^=x;
        }
        System.out.println("single value in arr "+result);
    }
}